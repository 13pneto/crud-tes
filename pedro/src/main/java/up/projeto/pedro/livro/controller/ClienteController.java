package up.projeto.pedro.livro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import up.projeto.pedro.livro.entity.Cliente;
import up.projeto.pedro.livro.entity.Livro;
import up.projeto.pedro.livro.service.ClienteService;
import up.projeto.pedro.livro.service.LivroService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@PostMapping(consumes = "application/json")
	public Cliente cliente(@RequestBody Cliente cliente) {
		return clienteService.salvar(cliente);
	}

	
	@GetMapping(produces = "application/json")
	public List<Cliente> listar(){
		return clienteService.listar();
	}
	
}
