package com.example.meuprimeiroapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Cadastro extends AppCompatActivity {
    EditText loginCad, senhaCad, confirmaSenhaCad;
    AlertDialog.Builder alertD;
    static ArrayList<Usuario> listaUsers; //Pega uma variávle de outra classe

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(Color.rgb(29, 126, 204));
        alertD = new AlertDialog.Builder(this);

        loginCad = findViewById(R.id.loginCad);
        senhaCad = findViewById(R.id.senhaCad);
        confirmaSenhaCad = findViewById(R.id.confirmaSenhaCad);
    }

    public void cadastrar(View v) { //Feito por Pedro Nieto
        String login = loginCad.getText().toString();
        String senha = senhaCad.getText().toString();
        String mensagem = "";

        if (verificarSeExiste(login)) {
            mensagem = "Usuário já existe";
        } else {
            if (verificarCampos()) {
                if (verificarSenha()) {
                    Usuario user = new Usuario(login, senha, false);
                    listaUsers.add(user);

                    mensagem = "Cadastro concluído! Seja bem-vindo(a)";
                    //Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
                    super.onBackPressed();

                } else {
                    mensagem = "Favor preencher as senhas igualmente";
                }
            } else {
                mensagem = "Favor preencher os campos corretamente";
            }
        }
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }

    public boolean verificarSeExiste(String login) {
        for (Usuario u : listaUsers) {
            if (u.getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarSenha() {
        ;
        String senha = senhaCad.getText().toString();
        String confirmarSenha = confirmaSenhaCad.getText().toString();

        if (senha.equals(confirmarSenha)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarCampos() {
        String login = loginCad.getText().toString();
        String senha = senhaCad.getText().toString();
        String confirmarSenha = confirmaSenhaCad.getText().toString();

        if (login.isEmpty() || senha.isEmpty() || confirmarSenha.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}