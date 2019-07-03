package com.e.garcomfastmeal.chamadas;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.e.garcomfastmeal.R;

import java.util.ArrayList;

public class ChamadasMesas extends AppCompatActivity {

    RecyclerView mRecyclerView;

    private ChamadasMesasAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chamadas_mesas);


        }

}