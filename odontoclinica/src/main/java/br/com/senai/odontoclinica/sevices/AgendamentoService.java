package br.com.senai.odontoclinica.sevices;

import org.springframework.stereotype.Service;

import br.com.senai.odontoclinica.repositorio.AgendamentoRepositorio;

@Service

public class AgendamentoService {

	final AgendamentoRepositorio agendamentoRepositorio;

	public AgendamentoService(AgendamentoRepositorio agendamentoRepositorio) {
		this.agendamentoRepositorio = agendamentoRepositorio;
	}

}
