package com.example.happyfish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CadastrarICMS extends AppCompatActivity {

    private Spinner spinnerEstado;
    private String[] listaEstados = {"Acre", "Alagoas", "Amapá", "Amazonas","Bahia",
            "Ceará", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul",
            "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro",
            "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina",
            "São Paulo", "Sergipe", "Tocantins", "Distrito Federal"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_i_c_m_s);

        spinnerEstado = findViewById(R.id.spinnerEstados);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_spinner_item,
                android.R.id.text1,
                listaEstados
        );

        spinnerEstado.setAdapter(adaptador);



    }
}
