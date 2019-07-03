package com.e.garcomfastmeal.chamadas;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.e.garcomfastmeal.R;

import java.util.ArrayList;

public class ChamadasMesasAdapter extends RecyclerView.Adapter<ChamadasMesasAdapter.LineHolder> {




    @NonNull
    @Override
    public LineHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull LineHolder lineHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class LineHolder extends RecyclerView.ViewHolder {



        public LineHolder(View itemView) {
            super(itemView);



        }

    }
}