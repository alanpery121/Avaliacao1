package com.example.happyfish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuPrincipal extends AppCompatActivity {

    private TextView tvUsuarioMenu;
    private Button btCadastrarICMS;
    private Button btCadastrarPedido;
    private Button btCadastrarVenda;
    private Button btVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        tvUsuarioMenu = findViewById(R.id.tvUsuarioMenu);
        btCadastrarICMS = findViewById(R.id.btCadastrarICMS);
        btCadastrarPedido = findViewById(R.id.btCadastrarPedido);
        btCadastrarVenda = findViewById(R.id.btCadastrarVenda);
        btVoltar = findViewById(R.id.btVoltar);

        Bundle valores = getIntent().getExtras();

        if(valores != null){
            tvUsuarioMenu.setText(valores.getString("nome"));
        }

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar;
                voltar = new Intent(MenuPrincipal.this, MainActivity.class);
                startActivity(voltar);
            }
        });

        btCadastrarICMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CadastrarICMS;
                CadastrarICMS = new Intent(MenuPrincipal.this, CadastrarICMS.class);
                startActivity(CadastrarICMS);
            }
        });

        btCadastrarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CadastrarPedido;
                CadastrarPedido = new Intent(MenuPrincipal.this, CadastroPedido.class);
                startActivity(CadastrarPedido);
            }
        });

        btCadastrarVenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CadastrarVenda;
                CadastrarVenda = new Intent(MenuPrincipal.this, CadastrarVenda.class);
                startActivity(CadastrarVenda);
            }
        });

    }
}
