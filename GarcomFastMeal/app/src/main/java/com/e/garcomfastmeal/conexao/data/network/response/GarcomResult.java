package com.e.garcomfastmeal.conexao.data.network.response;

import com.squareup.moshi.Json;

import java.util.List;

public class GarcomResult {

    @Json(name = "Garcons")
    private final List<GarcomResponse> resultadoGarcons;

    public GarcomResult(List<GarcomResponse> resultadoGarcons) {
        this.resultadoGarcons = resultadoGarcons;
    }

    public List<GarcomResponse> getResultadoGarcons() {
        return resultadoGarcons;
    }
}
