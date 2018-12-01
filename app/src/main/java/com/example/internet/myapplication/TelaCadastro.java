package com.example.internet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class TelaCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        final EditText etCadastroNome = (EditText) findViewById(R.id.etCadastroNome);
        final EditText etCadastroNCelular = (EditText) findViewById(R.id.etCadastroCelular);
        final EditText etCadastroEmail = (EditText) findViewById(R.id.etCadastroEmail);
        final EditText etCadastroSenha = (EditText) findViewById(R.id.etCadastroSenha);
        final EditText etCadastroConfSenha = (EditText) findViewById(R.id.etCadastroConfSenha);
        final EditText etCadastroCPF = (EditText) findViewById(R.id.etCadastroCPF);
        final Button butConfirmarCad = (Button) findViewById(R.id.butConfirmarCad);

    }
}
