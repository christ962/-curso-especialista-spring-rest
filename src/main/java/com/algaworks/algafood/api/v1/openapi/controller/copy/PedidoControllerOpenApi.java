package com.algaworks.algafood.api.v1.openapi.controller.copy;

import org.springframework.beans.factory.parsing.Problem;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.PagedModel;

import com.algaworks.algafood.api.v1.model.PedidoModel;
import com.algaworks.algafood.api.v1.model.PedidoResumoModel;
import com.algaworks.algafood.api.v1.model.input.PedidoInput;
import com.algaworks.algafood.domain.filter.PedidoFilter;


public interface PedidoControllerOpenApi {


    public PagedModel<PedidoResumoModel> pesquisar(PedidoFilter filtro, Pageable pageable);


    public PedidoModel adicionar(PedidoInput pedidoInput);


    public PedidoModel buscar(String codigoPedido);
}
