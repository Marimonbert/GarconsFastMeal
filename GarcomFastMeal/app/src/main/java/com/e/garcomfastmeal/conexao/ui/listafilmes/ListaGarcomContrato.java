package com.e.garcomfastmeal.conexao.ui.listafilmes;

import com.e.garcomfastmeal.conexao.data.model.Garcom;

import java.util.List;


public interface ListaGarcomContrato {

    interface ListaGarconsView {

        void mostraGarcons(List<Garcom> mesas);

        void mostraErro();
    }

    interface ListaGarconsPresenter {

        void obtemGarcons();

        void destruirView();
    }
}
