package com.algaworks.algafood.api.v1.openapi.model;

import java.util.List;

import com.algaworks.algafood.api.v1.model.FormaPagamentoModel;

import lombok.Data;

@Data
public class FormasPagamentoModelOpenApi {

	
	@Data
	public class FormasPagamentosEmbeddedModelOpenApi{
		
		private List<FormaPagamentoModel> formasPagamentos;
	}
}
