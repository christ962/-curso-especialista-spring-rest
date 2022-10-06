package com.algaworks.algafood.api.v1.openapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotAcceptableException;

import com.algaworks.algafood.api.exceptionhandler.Problema;
import com.algaworks.algafood.api.v1.model.FotoProdutoModel;
import com.algaworks.algafood.api.v1.model.input.FotoProdutoInput;

import java.io.IOException;

public interface RestauranteProdutoFotoControllerOpenApi {


    FotoProdutoModel atualizarFoto(Long restauranteId, Long produtoId, FotoProdutoInput fotoProdutoInput) throws IOException;


    void excluir(Long restauranteId, Long produtoId);


    FotoProdutoModel buscar(Long restauranteId, Long produtoId);

    ResponseEntity<?> servir(Long restauranteId, Long produtoId, String acceptHeader)
            throws HttpMediaTypeNotAcceptableException;
}
