package up.projeto.pedro.livro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import up.projeto.pedro.livro.entity.Filme;
import up.projeto.pedro.livro.service.FilmeService;

@RestController
@RequestMapping("/filme")
public class FilmeController {

	@Autowired
	private FilmeService filmeService;
	
	@PostMapping(consumes = "application/json")
	public Filme filme(@RequestBody Filme filme) {
		return filmeService.salvar(filme);
	}

	
	@GetMapping(produces = "application/json")
	public List<Filme> listar(){
		return filmeService.listar();
	}
	
}
