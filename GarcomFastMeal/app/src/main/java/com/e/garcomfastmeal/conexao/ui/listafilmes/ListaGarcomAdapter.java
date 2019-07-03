package com.e.garcomfastmeal.conexao.ui.listafilmes;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.e.garcomfastmeal.R;
import com.e.garcomfastmeal.conexao.data.model.Garcom;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class ListaGarcomAdapter extends RecyclerView.Adapter<ListaGarcomAdapter.ListaFilmesViewHolder> {

    private List<Garcom> Garsons;
    private static ItemMesaClickListener itemMesasClickListener;

    public ListaGarcomAdapter(ItemMesaClickListener itemMesasClickListener) {
        this.itemMesasClickListener = itemMesasClickListener;

        Garsons = new ArrayList<>();
    }

    @NonNull
    @Override
    public ListaFilmesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_garcom, parent, false);

        return new ListaFilmesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaFilmesViewHolder holder, int position) {
        holder.bind(Garsons.get(position));
    }

    @Override
    public int getItemCount() {
        return (Garsons != null && Garsons.size() > 0) ? Garsons.size() : 0;
    }

    static class ListaFilmesViewHolder extends RecyclerView.ViewHolder {

        private TextView NomeGarcom;
        private ImageView foto;
        private Garcom garcons;

        public ListaFilmesViewHolder(View itemView) {
            super(itemView);

            NomeGarcom = itemView.findViewById(R.id.text_garcom);
            foto = itemView.findViewById(R.id.image_garcom);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (itemMesasClickListener != null) {
                       itemMesasClickListener.onItemMesaClicada(garcons);
                    }
                }
            });
        }

        public void bind(Garcom garcom) {
            this.garcons = garcom;


            NomeGarcom.setText(garcom.getNome());

            Picasso.get()
                    .load("http://3.19.60.179/fastmeal/assets/imagens/" + garcom.getFoto())
                    .into(foto);
        }
    }


    public void setMesas(List<Garcom> garsons) {
        this.Garsons = garsons;
        notifyDataSetChanged();
    }

    public interface ItemMesaClickListener {

        void onItemMesaClicada(Garcom mesa);
    }
}
