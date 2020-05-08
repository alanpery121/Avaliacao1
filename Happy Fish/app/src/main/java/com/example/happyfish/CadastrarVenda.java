package com.example.happyfish;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ResourceBundle;

public class CadastrarVenda extends AppCompatActivity {

    private EditText etVenda;
    private Button btVenda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_venda);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setTitle("Cadastrar Venda");
        }

         final ResourceBundle valores1 = ResourceBundle.getBundle("valores");

        etVenda = findViewById(R.id.etVenda);
        btVenda = findViewById(R.id.btVenda);








        btVenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etVenda.getText().toString().isEmpty()){
                    Toast.makeText(CadastrarVenda.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                }else {
                    //Cria o gerador do AlertDialog
                    AlertDialog.Builder dialogICMS = new AlertDialog.Builder(CadastrarVenda.this);
                    //define o titulo
                    dialogICMS.setTitle("Salvar");
                    //define a mensagem
                    dialogICMS.setMessage("Deseja realmente salvar?");
                    //define um botão como positivo
                    dialogICMS.setPositiveButton("Salvar", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface arg0, int arg1) {
                            Toast.makeText(CadastrarVenda.this, "Salvo com sucesso "+"\nFuncionário: " + etVenda.getText().toString()+"\nCliente: "+String.valueOf(valores1), Toast.LENGTH_SHORT).show();
                        }
                    });
                    //define um botão como negativo.
                    dialogICMS.setNegativeButton("Sair", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface arg0, int arg1) {
                            Toast.makeText(CadastrarVenda.this, "Operação cancelada", Toast.LENGTH_SHORT).show();
                        }
                    });
                    //cria o AlertDialog
                    dialogICMS.create();
                    //Exibe
                    dialogICMS.show();
                    //Desabilitar o clique fora
                    dialogICMS.setCancelable(false);
                }
            }
        });
    }
}
