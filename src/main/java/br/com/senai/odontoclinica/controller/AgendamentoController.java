package br.com.senai.odontoclinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.senai.odontoclinica.orm.Agendamento;

import br.com.senai.odontoclinica.sevices.AgendamentoService;

@Controller

public class AgendamentoController {

	@Autowired
	private AgendamentoService servico;

	@GetMapping({"/cadastroagendamento"})
	public String listarAgendamento(Model modelo) {
		modelo.addAttribute("cadastroagendamento", servico.listarAgendamento());
		return "cadastroagendamento";
	}

	@GetMapping({ "/cadastroagendamento/{id}" })
	public String apagarAgendamento(@PathVariable Long id) {
		servico.apagarAgendamento(id);
		return "redirect:/cadastroagendamento";
	}

	@GetMapping("/cadastroagendamento/adicionar")
	public String adicionarAgendamento(Model modelo) {
		Agendamento agendamento = new Agendamento();
		modelo.addAttribute("cadastroagendamento", agendamento);
		return "agendamento";
	}

	@PostMapping("/cadastroagendamento")
	public String salvarAgendamento(@ModelAttribute("cadastroagendamento") Agendamento agendamento) {
		servico.salvarAgendamento(agendamento);
		return "redirect:/cadastroagendamento";
	}

	@GetMapping({ "/cadastroagendamento/editar/{id}" })
	public String editarAgendamento(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("cadastroagendamento", servico.consultarAgendamentoId(id));
		return "alteraragendamento";
	}

	@PostMapping("/cadastroagendamento/{id}")
	public String atualizarAgendamento(@PathVariable Long id,@ModelAttribute("cadastroagendamento") Agendamento agendamento, Model modelo) {
		Agendamento cat = servico.consultarAgendamentoId(id);
		cat.setId(id);
		cat.setNome(agendamento.getNome());
		cat.setTelefone(agendamento.getTelefone());
		cat.setDataConsulta(agendamento.getDataConsulta());
		cat.setDataHorario(agendamento.getDataHorario());

		servico.atualizarAgendamento(cat);
		return "redirect:/cadastroagendamento";
	}
}
