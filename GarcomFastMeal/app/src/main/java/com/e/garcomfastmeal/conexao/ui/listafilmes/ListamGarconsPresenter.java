package com.e.garcomfastmeal.conexao.ui.listafilmes;


import com.e.garcomfastmeal.conexao.data.mapper.GarcomMapper;
import com.e.garcomfastmeal.conexao.data.model.Garcom;
import com.e.garcomfastmeal.conexao.data.network.GarcomService;
import com.e.garcomfastmeal.conexao.data.network.response.GarcomResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListamGarconsPresenter implements ListaGarcomContrato.ListaGarconsPresenter {

    private ListaGarcomContrato.ListaGarconsView view;

    public ListamGarconsPresenter(ListaGarcomContrato.ListaGarconsView view) {
        this.view = view;
    }

    @Override
    public void obtemGarcons() {
        GarcomService.getInstance()
                .obterMesas()
                .enqueue(new Callback<GarcomResult>() {
                    @Override
                    public void onResponse(Call<GarcomResult> call, Response<GarcomResult> response) {
                        if (response.isSuccessful()) {
                            final List<Garcom> listaMesas = GarcomMapper
                                    .deResponseParaDominio(response.body().getResultadoGarcons());

                            view.mostraGarcons(listaMesas);
                        } else {
                            view.mostraErro();
                        }
                    }

                    @Override
                    public void onFailure(Call<GarcomResult> call, Throwable t) {
                        view.mostraErro();
                    }
                });
    }

    @Override
    public void destruirView() {
        this.view = null;
    }
}
