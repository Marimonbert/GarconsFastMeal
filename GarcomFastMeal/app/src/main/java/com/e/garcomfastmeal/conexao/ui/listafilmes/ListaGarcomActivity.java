package com.e.garcomfastmeal.conexao.ui.listafilmes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.e.garcomfastmeal.R;
import com.e.garcomfastmeal.conexao.data.model.Garcom;
import com.e.garcomfastmeal.conexao.ui.detalhesfilme.DetalhesGarcomActivity;

import java.util.List;



public class ListaGarcomActivity extends AppCompatActivity
        implements ListaGarcomContrato.ListaGarconsView,
        ListaGarcomAdapter.ItemMesaClickListener {

    private ListaGarcomAdapter GarsonsAdapter;
    private ListaGarcomContrato.ListaGarconsPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_garcom);

        configuraAdapter();

        presenter = new ListamGarconsPresenter(this);
        presenter.obtemGarcons();
    }

    private void configuraAdapter() {
        final RecyclerView recyclerMesas = findViewById(R.id.recycler_mesas);

        GarsonsAdapter = new ListaGarcomAdapter(this);

        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this);

        recyclerMesas.setLayoutManager(linearLayoutManager);
        recyclerMesas.setAdapter(GarsonsAdapter);
    }

    @Override
    public void mostraGarcons(List<Garcom> mesas) {
        GarsonsAdapter.setMesas(mesas);
    }

    @Override
    public void mostraErro() {
        Toast.makeText(this, "Erro ao obter garçom.", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.destruirView();
    }

    @Override
    public void onItemMesaClicada(Garcom mesa) {
        Intent intent = new Intent(this, DetalhesGarcomActivity.class);
        intent.putExtra(DetalhesGarcomActivity.EXTRA_FILME, mesa);
        startActivity(intent);
    }
}
