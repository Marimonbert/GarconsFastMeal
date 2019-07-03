package com.e.garcomfastmeal.conexao.data.network;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class GarcomService {

    private static ApiGarcom GARSONS;

    public static ApiGarcom getInstance() {
        if (GARSONS == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://3.19.60.179")
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build();

            GARSONS = retrofit.create(ApiGarcom.class);
        }

        return GARSONS;
    }
}
