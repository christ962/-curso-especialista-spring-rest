package com.algaworks.algafood.api.v1.model.input;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class EstadoInput {
 
    @NotBlank
    @Schema(example = "Minas Gerais")
	private String nome;
}
