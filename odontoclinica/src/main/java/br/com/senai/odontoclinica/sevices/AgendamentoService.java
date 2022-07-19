package br.com.senai.odontoclinica.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.senai.odontoclinica.orm.Agendamento;
import br.com.senai.odontoclinica.repositorio.AgendamentoRepositorio;

@Service

public class AgendamentoService {

	final AgendamentoRepositorio agendamentoRepositorio;

	public AgendamentoService(AgendamentoRepositorio agendamentoRepositorio) {
		this.agendamentoRepositorio = agendamentoRepositorio;
	}

	public Long agendar(Agendamento request) {
		Agendamento entity = agendamentoRepositorio.save(request);
		return entity.getId();
	}

	public List<Agendamento> listarAgendamento() {
		
		return null;
	}

	public Agendamento buscarAgendamentoPorId(Long id) {
		return agendamentoRepositorio.findById(id).orElse(null);
	}

	public void deletarAgendamento(Long id) {
		agendamentoRepositorio.deleteById(id);
	}

	public Agendamento alterarAgendamento(Agendamento request) {
		Optional<Agendamento> entity = agendamentoRepositorio.findById(request.getId());
		if (entity.isPresent()) {
			Agendamento obj = entity.get();
			obj.setNome(request.getNome());
			obj.setTelefone(request.getTelefone());
			obj.setDataConsulta(request.getDataConsulta());
			return agendamentoRepositorio.save(obj);
		}
		return null;
	}
	
	
}
