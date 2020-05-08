package com.example.happyfish;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity {

    private TextView tvUsuarioMenu;
    private Button btCadastrarICMS;
    private Button btCadastrarPedido;
    private Button btCadastrarVenda;
    private Button btVoltar;
    private Button btSobre;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setTitle("Menu Principal");
        }

        tvUsuarioMenu = findViewById(R.id.tvUsuarioMenu);
        btCadastrarICMS = findViewById(R.id.btCadastrarICMS);
        btCadastrarPedido = findViewById(R.id.btCadastrarPedido);
        btCadastrarVenda = findViewById(R.id.btCadastrarVenda);
        btVoltar = findViewById(R.id.btVoltar);
        btSobre = findViewById(R.id.btSobre);

        final Bundle valores = getIntent().getExtras();

        if(valores != null){
            tvUsuarioMenu.setText(valores.getString("nome"));
        }

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar;
                voltar = new Intent(MenuPrincipal.this, MainActivity.class);
                startActivity(voltar);
                finish();
            }
        });

        btCadastrarICMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cadastrarICMS;
                cadastrarICMS = new Intent(MenuPrincipal.this, CadastrarICMS.class);
                startActivity(cadastrarICMS);
            }
        });

        btCadastrarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cadastrarPedido;
                cadastrarPedido = new Intent(MenuPrincipal.this, CadastroPedido.class);
                startActivity(cadastrarPedido);
            }
        });

        btCadastrarVenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cadastrarVenda;
                cadastrarVenda = new Intent(MenuPrincipal.this, CadastrarVenda.class);
                startActivity(cadastrarVenda);
            }
        });

        btSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sobre = new Intent(MenuPrincipal.this, Sobre.class);
                startActivity(sobre);

            }
        });

    }
}
