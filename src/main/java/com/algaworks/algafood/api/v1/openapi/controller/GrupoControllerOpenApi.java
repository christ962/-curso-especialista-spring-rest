package com.algaworks.algafood.api.v1.openapi.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.hateoas.CollectionModel;
import io.swagger.v3.oas.annotations.tags.Tag;

import com.algaworks.algafood.api.exceptionhandler.Problema;
import com.algaworks.algafood.api.v1.model.GrupoModel;
import com.algaworks.algafood.api.v1.model.input.GrupoInput;
import org.springframework.http.ResponseEntity;

@SecurityRequirement(name = "security_auth")
@Tag(name = "Grupos")
public interface GrupoControllerOpenApi {

    @Operation(summary = "Listar os grupos")
    public CollectionModel<GrupoModel> listar();

    @Operation(summary = "Buscar um grupo por ID")
    public GrupoModel buscar(@Parameter(description = "ID de um grupo", example = "1", required = true)Long grupoId);

    @Operation(summary = "Cadastra um grupo")
    public GrupoModel adicionar(@RequestBody(description = "Representação de um novo grupo", required = true)GrupoInput grupoInput);

    @Operation(summary = "Atualiza um po ID")
    public GrupoModel atualizar(@Parameter(description = "ID de um grupo", example = "1", required = true)Long grupoId,
                                @RequestBody(description = "Representação de um grupo com os novos dados", required = true)GrupoInput grupoInput);

    @Operation(summary = "Exclui um grupo por ID")
    public ResponseEntity<Void> remover(Long grupoId);

}
