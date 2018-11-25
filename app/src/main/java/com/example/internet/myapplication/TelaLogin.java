package com.example.internet.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class TelaLogin extends AppCompatActivity {

    private EditText CPF;
    private EditText Senha;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        CPF = (EditText) findViewById(R.id.editTextCPF);
        Senha = (EditText)findViewById(R.id.editTextSenha);
        Login = (Button)findViewById(R.id.buttonLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(CPF.getText().toString(), Senha.getText().toString());
            }
        });
    }

    private void validate(String cpf, String senha){
        if ((cpf.equals("1234")) && (senha.equals("senha"))){
            Intent intMenu = new Intent (TelaLogin.this, TelaCarregamento.class);
            startActivity(intMenu);
        }
    }

}