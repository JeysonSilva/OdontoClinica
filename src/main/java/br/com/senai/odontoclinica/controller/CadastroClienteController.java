package br.com.senai.odontoclinica.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import br.com.senai.odontoclinica.orm.CadastroCliente;
import br.com.senai.odontoclinica.sevices.CadastroClienteService;


@Controller
public class CadastroClienteController {
	
	@Autowired
	private CadastroClienteService servico;
	
	
	@GetMapping({"/cadastrocliente"})
	public String listarCadastroCliente(Model modelo) {
		modelo.addAttribute("cadastrocliente", servico.listarCadastroClientes());
		return "cadastrocliente"; 
	}
	
	@GetMapping({"/cadastrocliente/{id}"})
	public String apagarCadastroCliente(@PathVariable Long id) {
		servico.apagarCadastroCliente(id);
		return "redirect:/cadastrocliente"; 
		}
	
	@GetMapping("/cadastrocliente/adicionar")
	public String adicionarCadastroCliente(Model modelo) {
		CadastroCliente cadastroCliente = new CadastroCliente();
		modelo.addAttribute("cadastrocliente", cadastroCliente);
		return "cadastro";
	}
	
	@PostMapping("/cadastrocliente")
	public String salvarCadastroCliente(@ModelAttribute("cadastrocliente") CadastroCliente cadastroCliente) {
		servico.salvarCadastroCliente(cadastroCliente);
		return "redirect:/cadastrocliente";
	}
	
	@GetMapping({"/cadastrocliente/editar/{id}"})
	public String editarCadastroCliente(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("cadastrocliente", servico.consultarCadastroClienteId(id));
		return "alterarcliente";
	}
	
	@PostMapping("/cadastrocliente/{id}")
	public String atualizarCadastroCliente(@PathVariable Long id, @ModelAttribute("cadastrocliente") CadastroCliente cadastroCliente, Model modelo) {
		CadastroCliente cat = servico.consultarCadastroClienteId(id);
		cat.setId(id);
		cat.setNome(cadastroCliente.getNome());
		cat.setCpf(cadastroCliente.getCpf());
		cat.setDataNascimento(cadastroCliente.getDataNascimento());
		cat.setEndereco(cadastroCliente.getEndereco());
		cat.setEmail(cadastroCliente.getEmail());
		cat.setTelefone(cadastroCliente.getTelefone());
		
		servico.atualizarCadastroCliente(cat);
		return "redirect:/cadastrocliente";
	}
}
