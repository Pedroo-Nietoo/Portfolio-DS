package com.example.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Admin extends AppCompatActivity {
    static ArrayList<Usuario> listaUsers;
    EditText buscaLogin;
    TextView resultado;
    Usuario encontrado = new Usuario();
    Button converter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(Color.rgb(78, 78, 78));
        buscaLogin = findViewById(R.id.buscarLogin);
        resultado = findViewById(R.id.resultado);
        converter = findViewById(R.id.btnConverter);
        converter.setVisibility(View.INVISIBLE);
    }

    public void buscar(View v) {
        String login = buscaLogin.getText().toString();
        String mensagem = "Login " + login + " não encontrado";

        for (Usuario u : listaUsers) {
            if (u.login.equals(login)) {
                mensagem = "Login " + login + " encontrado!";
                encontrado = u;
                converter.setVisibility(View.VISIBLE);

                if (u.isAdmin()) {
                    converter.setText("Converter para comum");
                } else {
                    converter.setText("Converter para admin");
                }
                break;
            } else {
                converter.setVisibility(View.INVISIBLE);
            }
        }
        resultado.setText(mensagem);
    }

    public void converter(View v) {
        String login = buscaLogin.getText().toString();
        String mensagem = "";
        if (encontrado.isAdmin()) {
            encontrado.setAdmin(false);
            mensagem = "Usuário " + login + " alterado para comum";
            converter.setVisibility(View.INVISIBLE);
        } else {
            encontrado.setAdmin(true);
            mensagem = "Usuário " + login + " alterado para admin";
            converter.setVisibility(View.INVISIBLE);
        }
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }
}