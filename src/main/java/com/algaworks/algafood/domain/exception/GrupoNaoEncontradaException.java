package com.algaworks.algafood.domain.exception;

public class GrupoNaoEncontradaException extends EntidadeNaoEncontrdaException {

	private static final long serialVersionUID = 1L;

	public GrupoNaoEncontradaException(String mensagem) {
		super(mensagem);

	}
	
	public GrupoNaoEncontradaException(Long estadoId) {
		this(String.format("Não existe um cadastro de grupo com código %d", estadoId));

	}

}
