package com.algaworks.algafood.api.exceptionhandler;

import lombok.Getter;

@Getter
public enum ProblemType {
    
	DADOS_INVALIDOS("/dados-invalidos","Dados invalidos"),
	PARAMETRO_INVALIDO("/parametro-invalido", "Parametro inválido"),
	MENSAGEM_INCONPREENSIVEL("/mensagem-incompreesivel","Mensagem incompreensível"),
	RECURSO_NAO_ENCONTRADO("/recurso-nao-encontrada","Recurso não encontrada"),
	ERRO_DE_SISTEMA("/erro_de_sistema","Erro de sistema"),
	ENTIDADE_EM_USO("/entidade-em-uso","Entidade em uso"),
	ERRO_NEGOGIO("/erro-negocio","Violação de regra de negócio"),
	ACESSO_NEGADO("/acesso-negado", "Acesso negado");
	
	private String title;
	private String uri;
	
	ProblemType(String path,String title){
		this.uri = "https://algafood.com.br" + path;
		this.title = title;
	}
}
