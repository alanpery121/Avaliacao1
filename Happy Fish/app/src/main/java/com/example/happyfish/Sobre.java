package com.example.happyfish;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class Sobre extends AppCompatActivity {

    private Button btAlan;
    private Button btHiago;
    private Button btThiago;
    private Button btVictor;
    private SeekBar sbAvaliacao;
    private TextView tvSeekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setTitle("Sobre a aplicação");
        }

        btAlan = findViewById(R.id.btAlan);
        btHiago = findViewById(R.id.btHiago);
        btThiago = findViewById(R.id.btThiago);
        btVictor = findViewById(R.id.btVictor);
        sbAvaliacao = findViewById(R.id.sbAvaliacao);
        tvSeekBar = findViewById(R.id.tvSeekBar);

        sbAvaliacao.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvSeekBar.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btAlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogUtil.mostrarDialog(Sobre.this, "Alan Pery", "Analista de sistemas e Desenvolvedor Android junior\nTelefone para contato (88)9-9936-0342", R.drawable.alan);
            }
        });

        btHiago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogUtil.mostrarDialog(Sobre.this, "Hiago Layann", "Futuro analista da PF", R.drawable.hiago);
            }
        });

        btThiago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogUtil.mostrarDialog(Sobre.this, "Thiago Moura", "Analista de Sistemas", R.drawable.thiago);
            }
        });

        btVictor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogUtil.mostrarDialog(Sobre.this, "Victor Emanoel", "Analista de sistemas e futuro engenheiro de software", R.drawable.victor);
            }
        });




    }
}
