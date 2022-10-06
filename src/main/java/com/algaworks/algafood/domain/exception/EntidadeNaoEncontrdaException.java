package com.algaworks.algafood.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public abstract class EntidadeNaoEncontrdaException extends RuntimeException {

	private static final long serialVersionUID = 1L;
   
	public  EntidadeNaoEncontrdaException(String mensagem) {
		super(mensagem);
	}
}
