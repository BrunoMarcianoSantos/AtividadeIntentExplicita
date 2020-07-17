package com.example.atividadeintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        Bundle extras = getIntent().getExtras();

        TextView resultNome = findViewById(R.id.txtresultNome);
        TextView resultEmail = findViewById(R.id.txtresultEmail);
        TextView resultCpf = findViewById(R.id.txtresultCpf);
        TextView resultCell = findViewById(R.id.txtresultCell);
        TextView resultSexo = findViewById(R.id.txtresultSexo);
        TextView resultEnviaremail = findViewById(R.id.txtresultEnviaremail);

        String nome = extras.getString(MainActivity.EXTRA_MESSAGE_NOME);
        String email = extras.getString(MainActivity.EXTRA_MESSAGE_EMAIL);
        String cpf = extras.getString(MainActivity.EXTRA_MESSAGE_CPF);
        String cell = extras.getString(MainActivity.EXTRA_MESSAGE_CELL);
        String sexo = extras.getString(MainActivity.EXTRA_MESSAGE_SEXO);
        String dados = extras.getString(MainActivity.EXTRA_MESSAGE_ENVIAREMAIL);


        resultNome.setText(nome);
        resultEmail.setText(email);
        resultCpf.setText(cpf);
        resultCell.setText(cell);
        resultSexo.setText(sexo);
        resultEnviaremail.setText(dados);
    }
}