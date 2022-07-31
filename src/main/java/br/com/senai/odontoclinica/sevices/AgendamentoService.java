package br.com.senai.odontoclinica.sevices;

import java.util.List;

import br.com.senai.odontoclinica.orm.Agendamento;

public interface AgendamentoService {
	
public List<Agendamento> listarAgendamento();
	
	public void apagarAgendamento(Long id);
	
	public Agendamento salvarAgendamento(Agendamento agendamento);
	
	public Agendamento consultarAgendamentoId(Long id);
	
	public Agendamento atualizarAgendamento(Agendamento agendamento);



}
