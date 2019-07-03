package com.e.garcomfastmeal.conexao.data.network;

import com.e.garcomfastmeal.conexao.data.network.response.GarcomResult;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiGarcom {

    @GET("fastmeal/garcon/json/")
    Call<GarcomResult> obterMesas();
}
