package up.projeto.pedro.livro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import up.projeto.pedro.livro.entity.Livro;
import up.projeto.pedro.livro.service.LivroService;

@RestController
@RequestMapping("/livro")
public class LivroController {

	@Autowired
	private LivroService livroService;
	
	@PostMapping(consumes = "application/json")
	public Livro livro(@RequestBody Livro livro) {
		return livroService.salvar(livro);
	}

	
	@GetMapping(produces = "application/json")
	public List<Livro> listar(){
		return livroService.listar();
	}
	
}
