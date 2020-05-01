package com.example.happyfish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class CadastrarPedido extends AppCompatActivity {

    private Button compBtPesquisar;
    private ListView compListaPedidos;
    private EditText compEtTotal;
    private Button compBtSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_pedido);

        compBtPesquisar = findViewById(R.id.compBtPesquisar);
        compListaPedidos = findViewById(R.id.compListaPedidos);
        compEtTotal = findViewById(R.id.compEtTotal);
        compBtSalvar = findViewById(R.id.compBtSalvar);

        compBtSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TelaSelecionarPedido = new Intent(CadastrarPedido.this, TelaSelecionarPedido.class);
            }

        });

    }
}
