package com.algaworks.algafood.api.v1.model;

import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import lombok.Getter;
import lombok.Setter;
@Relation(collectionRelation = "restaurante")
@Getter
@Setter
public class RestauranteModel extends RepresentationModel<RestauranteModel> {

	//@JsonView({ RestauranteView.Resumo.class, RestauranteView.ApenasNome.class })
	@Schema(example = "1")
	private Long id;
	
	//@JsonView({ RestauranteView.Resumo.class, RestauranteView.ApenasNome.class })
	@Schema(example = "Thai Gourmet")
	private String nome;
	
	//@JsonView(RestauranteView.Resumo.class)
	@Schema(example = "12.00")
	private BigDecimal taxaFrete;
	private CozinhaModel cozinha;
	private Boolean ativo;
	private EnderecoModel endereco;
	private Boolean aberto;
}
