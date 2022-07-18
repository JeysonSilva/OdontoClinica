package br.com.senai.odontoclinica.sevices;

import org.springframework.stereotype.Service;

import br.com.senai.odontoclinica.repositorio.CadastroClienteRepositorio;

@Service

public class CadastroClienteService {

	final CadastroClienteRepositorio cadastroClienteRepositorio;

	public CadastroClienteService(CadastroClienteRepositorio cadastroClienteRepositorio) {
		this.cadastroClienteRepositorio = cadastroClienteRepositorio;
	}

}
