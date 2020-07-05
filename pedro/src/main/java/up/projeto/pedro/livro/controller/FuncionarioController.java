package up.projeto.pedro.livro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import up.projeto.pedro.livro.entity.Funcionario;
import up.projeto.pedro.livro.entity.Livro;
import up.projeto.pedro.livro.service.FuncionarioService;
import up.projeto.pedro.livro.service.LivroService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

	@Autowired
	private FuncionarioService funcionarioService;
	
	@PostMapping(consumes = "application/json")
	public Funcionario funcionario(@RequestBody Funcionario funcionario) {
		return funcionarioService.salvar(funcionario);
	}

	
	@GetMapping(produces = "application/json")
	public List<Funcionario> listar(){
		return funcionarioService.listar();
	}
	
}
