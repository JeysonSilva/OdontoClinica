package br.com.senai.odontoclinica.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.odontoclinica.orm.Agendamento;
import br.com.senai.odontoclinica.sevices.AgendamentoServiceCRUD;

@RestController

@RequestMapping("/cadastroagendamendo")
public class AgendamentoController {

	final AgendamentoServiceCRUD agendamentoService;

	public AgendamentoController(AgendamentoServiceCRUD agendamentoService) {
		this.agendamentoService = agendamentoService;
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public Long agendar(Agendamento request) {
		return agendamentoService.agendar(request);		
	}
	
	@GetMapping("/cadastroagendamendo")
	public List<Agendamento> listarAgendamento(){
		return agendamentoService.listarAgendamento();
	}
	@GetMapping("/{id}")
	public Agendamento buscarAgedamentoPorId(@PathVariable Long id) {
		return agendamentoService.buscarAgendamentoPorId(id);
	}
	@DeleteMapping("/{id}")
	public void deletarAgendamento(@PathVariable Long id) {
		agendamentoService.deletarAgendamento(id);
	}
	
	public Agendamento alterarAgendamento(@RequestBody Agendamento request) {
		return agendamentoService.alterarAgendamento(request);
		
	}
}
