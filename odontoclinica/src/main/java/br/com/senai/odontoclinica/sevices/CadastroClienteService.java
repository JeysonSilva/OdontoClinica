package br.com.senai.odontoclinica.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.senai.odontoclinica.orm.CadastroCliente;
import br.com.senai.odontoclinica.repositorio.CadastroClienteRepositorio;

@Service

public class CadastroClienteService {

	final CadastroClienteRepositorio cadastroClienteRepositorio;

	public CadastroClienteService(CadastroClienteRepositorio cadastroClienteRepositorio) {
		this.cadastroClienteRepositorio = cadastroClienteRepositorio;
	}

	public Long cadastrar(CadastroCliente request) {
		CadastroCliente entity = cadastroClienteRepositorio.save(request);
		return entity.getId();
	}

	public List<CadastroCliente> listar() {
		return cadastroClienteRepositorio.findAll();
	}

	public CadastroCliente buscarPorId(Long id) {
		return cadastroClienteRepositorio.findById(id).orElse(null);
	}

	public void deletar(Long id) {
		cadastroClienteRepositorio.deleteById(id);

	}

	public CadastroCliente alterar(CadastroCliente request) {
		Optional<CadastroCliente> entity = cadastroClienteRepositorio.findById(request.getId());
		if (entity.isPresent()) {
			CadastroCliente obj = entity.get();
			obj.setNome(request.getNome());
			obj.setCpf(request.getCpf());
			obj.setDataNascimento(request.getDataNascimento());
			obj.setEmail(request.getEmail());
			obj.setTelefone(request.getTelefone());
			obj.setEndereco(request.getEndereco());
			return cadastroClienteRepositorio.save(obj);
		}
		return null;
	}

}
