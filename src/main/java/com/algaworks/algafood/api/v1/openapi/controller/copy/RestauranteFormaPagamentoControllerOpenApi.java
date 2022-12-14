package com.algaworks.algafood.api.v1.openapi.controller.copy;

import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;

import com.algaworks.algafood.api.v1.model.FormaPagamentoModel;


public interface RestauranteFormaPagamentoControllerOpenApi {
   

	CollectionModel<FormaPagamentoModel> listar(
					Long restauranteId);


	ResponseEntity<Void> desassociar(
					Long restauranteId,

					Long formaPagamentoId);


	ResponseEntity<Void> associar(Long restauranteId, Long formaPagamentoId);
}
