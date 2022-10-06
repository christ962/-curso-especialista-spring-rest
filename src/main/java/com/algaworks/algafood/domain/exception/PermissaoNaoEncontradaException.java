package com.algaworks.algafood.domain.exception;

public class PermissaoNaoEncontradaException extends EntidadeNaoEncontrdaException {

	private static final long serialVersionUID = 1L;

	public PermissaoNaoEncontradaException(String mensagem) {
		super(mensagem);
		// TODO Auto-generated constructor stub
	}

	public PermissaoNaoEncontradaException(long permissaoId) {
		this(String.format("Não existe um cadastro de permissão com código %d", permissaoId));
	}

}
