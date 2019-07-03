package com.e.garcomfastmeal.conexao.ui.detalhesfilme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.e.garcomfastmeal.chamadas.ChamadasMesas;
import com.e.garcomfastmeal.Pedidos.PedidosMesas;
import com.e.garcomfastmeal.R;
import com.e.garcomfastmeal.conexao.data.model.Garcom;


public class DetalhesGarcomActivity extends AppCompatActivity {

    public static final String EXTRA_FILME = "EXTRA_FILME";
    private Button Pedidos;
    private Button chamadas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trabalho_garcom);




        Pedidos = (Button) findViewById(R.id.Pedidos);

        Pedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetalhesGarcomActivity.this, PedidosMesas.class);
                startActivity(i);
            }
        });

        chamadas = (Button) findViewById(R.id.Chamadas);

        chamadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetalhesGarcomActivity.this, ChamadasMesas.class);
                startActivity(i);
            }
        });



        final Garcom mesa = (Garcom) getIntent().getSerializableExtra(EXTRA_FILME);


    }
}
