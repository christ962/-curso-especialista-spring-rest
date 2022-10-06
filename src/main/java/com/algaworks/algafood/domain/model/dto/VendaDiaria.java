package com.algaworks.algafood.domain.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VendaDiaria {

	private LocalDate data;
	private Long totalVendas;
	private BigDecimal totalFaturado;
}
