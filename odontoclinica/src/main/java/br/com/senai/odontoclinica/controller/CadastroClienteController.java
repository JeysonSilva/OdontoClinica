package br.com.senai.odontoclinica.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.odontoclinica.sevices.CadastroClienteService;

@RestController

@RequestMapping("/cadastrocliente")
public class CadastroClienteController {

	final CadastroClienteService cadastroClienteService;

	public CadastroClienteController(CadastroClienteService cadastroClienteService) {
		this.cadastroClienteService = cadastroClienteService;
	}
	
	
}
