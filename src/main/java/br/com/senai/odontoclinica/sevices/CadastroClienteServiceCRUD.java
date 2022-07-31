package br.com.senai.odontoclinica.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.senai.odontoclinica.orm.CadastroCliente;
import br.com.senai.odontoclinica.repositorio.CadastroClienteRepositorio;

@Service

public class CadastroClienteServiceCRUD implements CadastroClienteService{

	@Autowired
	private CadastroClienteRepositorio repository;
	
	public List<CadastroCliente> listarCadastroClientes(){
		return (List<CadastroCliente>) repository.findAll();
	}
	
	public void apagarCadastroCliente(Long id) {
		repository.deleteById(id);
	}
	
	public CadastroCliente salvarCadastroCliente(CadastroCliente cadastroCliente) {
		return repository.save(cadastroCliente);
	}
	
	public CadastroCliente consultarCadastroClienteId(Long id) {
		return repository.findById(id).get();
	}
	
	public CadastroCliente atualizarCadastroCliente(CadastroCliente cadastroCliente) {
		return repository.save(cadastroCliente);
	}

	
}
