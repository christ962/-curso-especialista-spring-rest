package com.algaworks.algafood.api.v1.openapi.controller.copy;

import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;

import com.algaworks.algafood.api.exceptionhandler.Problema;
import com.algaworks.algafood.api.v1.model.GrupoModel;

public interface UsuarioGrupoControllerOpenApi {


    CollectionModel<GrupoModel> listar(Long usuarioId);


    ResponseEntity<Void> desassociar(Long usuarioId, Long grupoId);


    ResponseEntity<Void> associar(Long usuarioId, Long grupoId);
}
