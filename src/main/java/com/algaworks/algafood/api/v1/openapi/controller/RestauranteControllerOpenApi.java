package com.algaworks.algafood.api.v1.openapi.controller;

import java.util.List;

import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;

import com.algaworks.algafood.api.exceptionhandler.Problema;
import com.algaworks.algafood.api.v1.model.RestauranteApenasNomeModel;
import com.algaworks.algafood.api.v1.model.RestauranteBasicoModel;
import com.algaworks.algafood.api.v1.model.RestauranteModel;
import com.algaworks.algafood.api.v1.model.input.RestauranteInput;
import com.fasterxml.jackson.annotation.JsonIgnore;



public interface RestauranteControllerOpenApi {


    CollectionModel<RestauranteBasicoModel> listar();

    @JsonIgnore
    public CollectionModel<RestauranteApenasNomeModel> listarApenasNomes();


    public RestauranteModel buscar(
            Long restauranteId);


    public RestauranteModel adicionar(RestauranteInput restauranteInput);


    public RestauranteModel atualizar(Long restauranteId, RestauranteInput restauranteInput);


    public ResponseEntity<Void> ativar(Long restauranteId);


    public ResponseEntity<Void> inativar(
            Long restauranteId);


    public void ativarMultiplos(List<Long> restauranteIds);


    public void inativarMultiplos(
            List<Long> restauranteIds);


    public ResponseEntity<Void> abrir(Long restauranteId);


    public ResponseEntity<Void> fechar(Long restauranteId);

}
