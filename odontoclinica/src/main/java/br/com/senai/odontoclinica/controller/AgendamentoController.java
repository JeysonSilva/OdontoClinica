package br.com.senai.odontoclinica.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.odontoclinica.sevices.AgendamentoService;

@RestController

@RequestMapping("/agendamento")
public class AgendamentoController {

	final AgendamentoService agendamentoService;

	public AgendamentoController(AgendamentoService agendamentoService) {
		this.agendamentoService = agendamentoService;
	}
}
