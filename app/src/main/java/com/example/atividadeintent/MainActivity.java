package com.example.atividadeintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE_NOME = "com.example.intent.NOME";
    public final static String EXTRA_MESSAGE_EMAIL = "com.example.intent.EMAIL";
    public final static String EXTRA_MESSAGE_CPF = "com.example.intent.CPF";
    public final static String EXTRA_MESSAGE_CELL = "com.example.intent.CELL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Enviar(View v)
    {
        EditText txtNome = findViewById(R.id.txtNome);
        EditText txtEmail = findViewById(R.id.txtEmail);
        EditText txtCpf = findViewById(R.id.txtCpf);
        EditText txtCell = findViewById(R.id.txtCell);

        String nome = txtNome.getText().toString();
        String email = txtEmail.getText().toString();
        String cpf = txtCpf.getText().toString();
        String cell = txtCell.getText().toString();


        Intent intent = new Intent(this, ActivityResultado.class);
        intent.putExtra(EXTRA_MESSAGE_NOME, nome);
        intent.putExtra(EXTRA_MESSAGE_EMAIL, email);
        intent.putExtra(EXTRA_MESSAGE_CPF, cpf);
        intent.putExtra(EXTRA_MESSAGE_CELL, cell);
        startActivity(intent);

    }
}