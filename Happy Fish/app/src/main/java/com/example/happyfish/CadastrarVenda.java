package com.example.happyfish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CadastrarVenda extends AppCompatActivity {

    private EditText etVenda;
    private TextView tvVenda;
    private Button btVenda;
    String varia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_venda);

        etVenda = findViewById(R.id.etVenda);
        tvVenda = findViewById(R.id.tvVenda);
        btVenda = findViewById(R.id.btVenda);

        final Bundle valores1 = getIntent().getExtras();


        if(valores1 != null){
            tvVenda.setText(valores1.getString("nomeFuncionario"));
        }
        btVenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CadastrarVenda.this, "A venda foi salva com sucesso"+"\nFuncionário: "+etVenda.getText().toString()+"\nCliente: "+valores1.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
