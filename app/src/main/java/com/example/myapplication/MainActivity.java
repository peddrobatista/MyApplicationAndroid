package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Criando os representantes para a manipulação dos componentes
    private TextView lblMensagem;
    private EditText textInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Escondendo a barra de ação (ActionBar)
        getSupportActionBar().hide();

        // Colocando o aplicativo atrás das barras do sistema
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        // Pegando o elemento pelo seu id
        lblMensagem = findViewById(R.id.lblMensagem);
        textInput = findViewById(R.id.textInput);
    }
    // Criando o método
    public void clicar(View view) {
        // Pegando o valor do input
        String texto = textInput.getText().toString();
        // Passando o valor para a caixa de texto
        lblMensagem.setText(texto);
    }
}