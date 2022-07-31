package br.com.senai.odontoclinica.sevices;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.odontoclinica.orm.Agendamento;

import br.com.senai.odontoclinica.repositorio.AgendamentoRepositorio;


@Service

public class AgendamentoServiceCRUD implements AgendamentoService{

	@Autowired
	private AgendamentoRepositorio repository;
	
	public List<Agendamento> listarAgendamento(){
		return (List<Agendamento>) repository.findAll();
	}
	
	public void apagarAgendamento(Long id) {
		repository.deleteById(id);
	}
	
	public Agendamento salvarAgendamento(Agendamento agendamento) {
		return repository.save(agendamento);
	}
	
	public Agendamento consultarAgendamentoId(Long id) {
		return repository.findById(id).get();
	}
	
	public Agendamento atualizarAgendamento(Agendamento agendamento) {
		return repository.save(agendamento);
	}


	
	
}
