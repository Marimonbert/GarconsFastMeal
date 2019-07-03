package com.e.garcomfastmeal.conexao.data.mapper;

import com.e.garcomfastmeal.conexao.data.model.Garcom;
import com.e.garcomfastmeal.conexao.data.network.response.GarcomResponse;

import java.util.ArrayList;
import java.util.List;


public class GarcomMapper {

    public static List<Garcom> deResponseParaDominio(List<GarcomResponse> listaGarcomResponse) {
        List<Garcom> listaMesas = new ArrayList<>();

        for (GarcomResponse garcomResponse : listaGarcomResponse) {
            final Garcom mesa = new Garcom(garcomResponse.getNome(), garcomResponse.getFoto());
            listaMesas.add(mesa);
        }

        return listaMesas;
    }
}
