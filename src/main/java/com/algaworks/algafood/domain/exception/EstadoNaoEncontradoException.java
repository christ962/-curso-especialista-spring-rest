
package com.algaworks.algafood.domain.exception;

public class EstadoNaoEncontradoException extends EntidadeNaoEncontrdaException {
 
	
	private static final long serialVersionUID = 1L;

	public EstadoNaoEncontradoException(String menssagem) {
		super(menssagem);
	}
	public EstadoNaoEncontradoException(Long estadoId) {
		this(String.format("Não existe um cadastro de estado com código %d", estadoId));
	}
}
