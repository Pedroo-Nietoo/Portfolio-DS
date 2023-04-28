package com.example.meuprimeiroapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText campoNome, campoSenha;
    AlertDialog.Builder alertD;
    ArrayList<Usuario> listaUsers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Primeiro método da activity a ser executado
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); //Obter o banner com o título do app e esconder
        getWindow().setStatusBarColor(Color.rgb(29, 126, 204)); //Altera a cor da StatusBar
        campoNome = findViewById(R.id.campoNome); //Vincular variável do java com componente do xml que tem o id "campoIdade"
        campoSenha = findViewById(R.id.campoSenha);
        alertD = new AlertDialog.Builder(this);

        Usuario user1 = new Usuario("admin", "admin", true);
        Usuario user2 = new Usuario("pedro", "123", false);
        listaUsers.add(user1);
        listaUsers.add(user2);
    }

    public void cadastrar(View v) {
        Intent i = new Intent(this, Cadastro.class);
        startActivity(i);
        Cadastro.listaUsers = listaUsers;
    }

    public void logar(View v) {
        String user = campoNome.getText().toString();
        String senha = campoSenha.getText().toString();
        String mensagem = "Bem-vindo(a)";

        if (verificarCampos()) {
            for (Usuario u : listaUsers) {
                if (user.equals(u.getLogin()) && senha.equals(u.getSenha())) {
                    if (u.isAdmin()) {
                        Intent i = new Intent(this, Admin.class); //Cria uma intent, "Intenção", para a activity_admin
                        startActivity(i);
                        Admin.listaUsers = listaUsers;
                    } else {
                        Intent i = new Intent(this, Comum.class); //Cria uma intent, "Intenção", para a activity_admin
                        startActivity(i);
                    }
                    mensagem = "Bem-vindo(a)";
                    break;
                } else {
                    mensagem = "Usuário ou senha incorretos";
                }
            }
            Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Favor preencher os campos corretamente", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean verificarCampos() {
        String user = campoNome.getText().toString();
        String senha = campoSenha.getText().toString();
        if (user.isEmpty() || senha.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

//    public void boasVindas(){
//        alertD.setTitle("Boas vindas!");
//        alertD.setMessage("Olá, " + campoNome.getText() + "! Te desejamos as boas vindas ao nosso aplicativo!");
//        alertD.setNeutralButton("OK", null);
//        alertD.show();
//    }
}