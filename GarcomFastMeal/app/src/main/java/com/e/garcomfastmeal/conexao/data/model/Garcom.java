package com.e.garcomfastmeal.conexao.data.model;

import java.io.Serializable;

public class Garcom implements Serializable {


    private String nome;
    private String foto;


    public Garcom(String nome, String foto) {
        this.nome = nome;
        this.foto = foto;
    }



    public String getFoto() {
        return foto;

    }
    public String getNome() {
        return nome;
    }


}
