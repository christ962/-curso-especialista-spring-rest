package com.algaworks.algafood.api.v1.openapi.model;

import java.util.List;

import org.springframework.hateoas.Links;

import com.algaworks.algafood.api.v1.model.CidadeModel;

import lombok.Data;

@Data
public class CidadesModelOpenApi {
 
	private CidadeembaddedModelOpenApi _embedded;
	private Links _links;
	
	@Data
	public class CidadeembaddedModelOpenApi{
		
		private List<CidadeModel> cidades;
		
	}
}
