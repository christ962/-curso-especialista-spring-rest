package com.algaworks.algafood.api.v1.openapi.controller.copy;


import org.springframework.hateoas.CollectionModel;

import com.algaworks.algafood.api.v1.model.GrupoModel;
import com.algaworks.algafood.api.v1.model.input.GrupoInput;


public interface GrupoControllerOpenApi {


    public CollectionModel<GrupoModel> listar();


    public GrupoModel buscar(Long grupoId);


    public GrupoModel adicionar(GrupoInput grupoInput);


    public GrupoModel atualizar(Long grupoId, GrupoInput grupoInput);


    public void remover(Long grupoId);

}
