package com.e.garcomfastmeal.conexao.data.network.response;

import com.squareup.moshi.Json;

public class GarcomResponse {

    @Json(name = "nome")
    private String nome;

    @Json(name = "foto")
    private String foto;


    public GarcomResponse(String nome, String foto) {

        this.nome = nome;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }


    public String getFoto() {
        return foto;
    }

}
