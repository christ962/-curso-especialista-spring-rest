package com.algaworks.algafood.api.v1.openapi.controller.copy;

import org.springframework.http.ResponseEntity;

import com.algaworks.algafood.api.exceptionhandler.Problema;



public interface FluxoPedidoControllerOpenApi {


	ResponseEntity<Void> confirmar(String codigoPedido);


	ResponseEntity<Void> cancelar(String codigoPedido);


	ResponseEntity<Void> entregar( String codigoPedido);
}
