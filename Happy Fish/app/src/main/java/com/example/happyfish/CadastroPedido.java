package com.example.happyfish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class CadastroPedido extends AppCompatActivity {

    private EditText etNomeCliente;
    private TextView tvPeixe;
    private ListView lvPeixe;
    private EditText etKgPeixe;
    private Button btSalvarPedido;
    private String[] listaPeixe = {"TRAÍRA", "BAIACU ARARA", "PINTADO", "CORVINA", "LAMBARÍ",
            "TAMBAQUI", "TILÁPIA", "CARPA", "PEIXE-CACHORRO", "BAGRE AMARELO", "PIAU",
            "CASCUDO", "DOURADO", "CURIMATÃ", "TUVIRA"};
    String peixeClicado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pedido);

        etNomeCliente = findViewById(R.id.etNomeCliente);
        tvPeixe = findViewById(R.id.tvPeixe);
        lvPeixe = findViewById(R.id.lvPeixe);
        etKgPeixe = findViewById(R.id.etKgPeixe);
        btSalvarPedido = findViewById(R.id.btSalvarPedido);


        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                listaPeixe

        );


        lvPeixe.setAdapter(adaptador);

        lvPeixe.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Item selecionado: "+listaPeixe[position], Toast.LENGTH_SHORT).show();

                peixeClicado = lvPeixe.getItemAtPosition(position).toString();
            }
        });




        btSalvarPedido.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if((peixeClicado.length() <= 0) || etKgPeixe.getText().toString().isEmpty() || etNomeCliente.getText().toString().isEmpty()){
                    Toast.makeText(CadastroPedido.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(CadastroPedido.this, "Salvo com sucesso" + "\n" + "Nome do cliente " + etNomeCliente.getText().toString()
                            + "\n" + etKgPeixe.getText().toString() + "kg" + "\nde peixe " + peixeClicado.toString(), Toast.LENGTH_SHORT).show();

                    Intent intent1 = new Intent(CadastroPedido.this, CadastrarVenda.class);
                    intent1.putExtra("nomeFuncionario", etNomeCliente.getText().toString());



                }
            }
        });


    }
}
