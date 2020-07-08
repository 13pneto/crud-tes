package up.projeto.pedro.livro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import up.projeto.pedro.livro.entity.Cliente;
import up.projeto.pedro.livro.service.ClienteService;

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
	
	@GetMapping (value = "/buscarporid/{id}", produces = "application/json")
	public Cliente buscarPorId (@PathVariable Integer id)
	{
		return clienteService.buscarPorId (id);
	}
	
	@GetMapping (value = "/buscarporcpf/{cpf}", produces = "application/json")
	public List<Cliente> buscarPorCpf (@PathVariable String cpf)
	{
		return clienteService.buscarPorCpf(cpf);
	}
	
}
