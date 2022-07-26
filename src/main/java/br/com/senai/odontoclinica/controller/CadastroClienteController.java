package br.com.senai.odontoclinica.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.odontoclinica.orm.CadastroCliente;
import br.com.senai.odontoclinica.sevices.CadastroClienteService;

@RestController
@RequestMapping("/cadastrocliente")
public class CadastroClienteController {

	final CadastroClienteService cadastroClienteService;

	public CadastroClienteController(CadastroClienteService cadastroClienteService) {
		this.cadastroClienteService = cadastroClienteService;
	}

	@PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public Long cadastrar(CadastroCliente request) {
		return cadastroClienteService.cadastrar(request);
	}
	
	@GetMapping
	public List<CadastroCliente> listar(){
		return cadastroClienteService.listar();		
	}

	@GetMapping("/{id}")
	public CadastroCliente buscarPorId(@PathVariable Long id){
		return cadastroClienteService.buscarPorId(id);		
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		cadastroClienteService.deletar(id);
	}
	
	@PutMapping
	public CadastroCliente alterar(@RequestBody CadastroCliente request) {
		return cadastroClienteService.alterar(request);
	}
}
