package com.example.happyfish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etSenha;
    private EditText ptUsuario;
    private Button btEntrar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSenha = findViewById(R.id.etSenha);
        ptUsuario = findViewById(R.id.ptUsuario);
        btEntrar = findViewById(R.id.btEntrar);

        btEntrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenuPrincipal.class);
                intent.putExtra("nome", ptUsuario.getText().toString());
                intent.putExtra("senha", etSenha.getText().toString());

                startActivity(intent);
            }
        });


    }
}

