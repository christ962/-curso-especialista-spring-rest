package com.algaworks.algafood.core.validation;

import java.math.BigDecimal;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ValidationException;

import org.springframework.beans.BeanUtils;

public class ValorZeroIncluiDescricaoValidador implements ConstraintValidator<ValorZeroIncluiDescricao, Object> {

	private String valorField;
	private String descricaoField;
	private String descricaoObrigatoria;
	
	@Override
	public void initialize(ValorZeroIncluiDescricao constraint) {
		this.valorField = constraint.valorField();
		this.descricaoField = constraint.descricaoField();
		this.descricaoObrigatoria = constraint.descricaoObrigatoria();
	}
	
	
	@Override
	public boolean isValid(Object objetoValidacao, ConstraintValidatorContext context) {
		boolean valido = true;
		
		try {
		BigDecimal valor = (BigDecimal) BeanUtils.getPropertyDescriptor(objetoValidacao.getClass(),valorField)
				.getReadMethod().invoke(objetoValidacao);
		
		String descircao = (String) BeanUtils.getPropertyDescriptor(objetoValidacao.getClass(),descricaoField)
				.getReadMethod().invoke(objetoValidacao);
		
		if (valor != null && BigDecimal.ZERO.compareTo(valor) == 0 && descircao != null) {
			valido = descircao.toLowerCase().contains(this.descricaoObrigatoria.toLowerCase());
		}
		
		}catch(Exception e) {
			throw new ValidationException(e);
		}	
				
		
		return valido;
	}

}
