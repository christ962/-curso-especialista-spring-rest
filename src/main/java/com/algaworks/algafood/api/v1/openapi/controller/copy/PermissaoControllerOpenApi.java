package com.algaworks.algafood.api.v1.openapi.controller.copy;

import org.springframework.hateoas.CollectionModel;

import com.algaworks.algafood.api.v1.model.PermissaoModel;


public interface PermissaoControllerOpenApi {
 
	    CollectionModel<PermissaoModel> listar();
}
