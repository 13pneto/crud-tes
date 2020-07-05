package up.projeto.pedro.livro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import up.projeto.pedro.livro.entity.Comissao;
import up.projeto.pedro.livro.entity.Livro;
import up.projeto.pedro.livro.service.ComissaoService;
import up.projeto.pedro.livro.service.LivroService;

@RestController
@RequestMapping("/comissao")
public class ComissaoController {

	@Autowired
	private ComissaoService comissaoService;
	
	@PostMapping(consumes = "application/json")
	public Comissao comissao(@RequestBody Comissao comissao) {
		return comissaoService.salvar(comissao);
	}

	
	@GetMapping(produces = "application/json")
	public List<Comissao> listar(){
		return comissaoService.listar();
	}
	
}
