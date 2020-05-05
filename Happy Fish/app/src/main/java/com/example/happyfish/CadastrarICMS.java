package com.example.happyfish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CadastrarICMS extends AppCompatActivity {

    private EditText etICMS;
    private EditText etEstado;
    private Button btSalvarICMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_i_c_m_s);

        etICMS = findViewById(R.id.etICMS);
        etEstado = findViewById(R.id.etEstado);
        btSalvarICMS = findViewById(R.id.btSalvarICMS);

        btSalvarICMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etICMS.getText().toString().isEmpty() || etEstado.getText().toString().isEmpty()){
                    Toast.makeText(CadastrarICMS.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(CadastrarICMS.this, "Salvo com sucesso"+"\n"+"O estado "+etEstado.getText().toString()+" tem uma aliquota de  "+etICMS.getText().toString()+"%", Toast.LENGTH_SHORT).show();
                }
            }
        });






    }
}
