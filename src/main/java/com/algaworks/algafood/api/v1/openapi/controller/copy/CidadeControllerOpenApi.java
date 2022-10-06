package com.algaworks.algafood.api.v1.openapi.controller.copy;


import org.springframework.hateoas.CollectionModel;

import com.algaworks.algafood.api.exceptionhandler.Problema;
import com.algaworks.algafood.api.v1.model.CidadeModel;
import com.algaworks.algafood.api.v1.model.input.CidadeInput;


public interface CidadeControllerOpenApi {

    public CollectionModel<CidadeModel> listar();
    public CidadeModel buscar(Long cidadeId);
    public CidadeModel adicionar(CidadeInput cidadeInput);
    public CidadeModel atualizar(Long cidadeId, CidadeInput cidadeInput);

    public void remover(Long cidadeId);


}
