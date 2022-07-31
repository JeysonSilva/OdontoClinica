package br.com.senai.odontoclinica.sevices;

import java.util.List;

import br.com.senai.odontoclinica.orm.CadastroCliente;

public interface CadastroClienteService {
	
public List<CadastroCliente> listarCadastroClientes();
	
	public void apagarCadastroCliente(Long id);
	
	public CadastroCliente salvarCadastroCliente(CadastroCliente cadastroCliente);
	
	public CadastroCliente consultarCadastroClienteId(Long id);
	
	public CadastroCliente atualizarCadastroCliente(CadastroCliente cadastroCliente);

}
