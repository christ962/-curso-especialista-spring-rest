package com.algaworks.algafood.api.v1.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.api.v1.assembler.EstadoInputDisassembler;
import com.algaworks.algafood.api.v1.assembler.EstadoModelAssembler;
import com.algaworks.algafood.api.v1.model.EstadoModel;
import com.algaworks.algafood.api.v1.model.input.EstadoInput;
import com.algaworks.algafood.api.v1.openapi.controller.EstadoControllerOpenApi;
import com.algaworks.algafood.core.security.CheckSecurity;
import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import com.algaworks.algafood.domain.service.CadastroEstadoService;

@RestController
@RequestMapping(path = "/v1/estados")
public class EstadoController implements EstadoControllerOpenApi {

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private CadastroEstadoService cadastroEstado;

	@Autowired
	private EstadoModelAssembler estadoModelAssembler;

	@Autowired
	private EstadoInputDisassembler estadoInputDisassembler;

	
	@CheckSecurity.Estados.PodeConsultar
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public CollectionModel<EstadoModel> listar() {
		List<Estado> todosEstados = estadoRepository.findAll();
		
		return estadoModelAssembler.toCollectionModel(todosEstados);
	}
	
	
	@CheckSecurity.Estados.PodeConsultar
	@GetMapping(path = "/{estadoId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public EstadoModel buscar(@PathVariable Long estadoId) {
		Estado estado = cadastroEstado.bucarOuFalhar(estadoId);
		return estadoModelAssembler.toModel(estado);
	}
   
	@CheckSecurity.Estados.PodeEditar
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public EstadoModel adicionar(@RequestBody @Valid EstadoInput estadoInput) {
		Estado estado = estadoInputDisassembler.toDomaninObject(estadoInput);
		estado = cadastroEstado.salvar(estado);

		return estadoModelAssembler.toModel(estado);
	}
    
	@CheckSecurity.Estados.PodeEditar
	@PutMapping(path = "/{estadoId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public EstadoModel atualizar(@PathVariable Long estadoId, @RequestBody @Valid EstadoInput estadoInput) {

		Estado estadoAtual = cadastroEstado.bucarOuFalhar(estadoId);

		estadoInputDisassembler.copyToDomainObject(estadoInput, estadoAtual);

		estadoAtual = cadastroEstado.salvar(estadoAtual);

		return estadoModelAssembler.toModel(estadoAtual);

	}
   
	@CheckSecurity.Estados.PodeEditar
	@DeleteMapping(path = "/{estadoId}", produces = {})
	public ResponseEntity<Void> remover(@PathVariable Long estadoId) {
		cadastroEstado.excluir(estadoId);
	   return ResponseEntity.noContent().build();
	}

}
