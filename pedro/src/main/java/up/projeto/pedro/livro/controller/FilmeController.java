package up.projeto.pedro.livro.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import up.projeto.pedro.livro.entity.Filme;
import up.projeto.pedro.livro.service.FilmeService;

@CrossOrigin()
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
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public Filme f(@PathVariable Integer id){
	return filmeService.buscarPorId(id);
	}

	@DeleteMapping(value = "/{id}", produces = "application/json")	
	public void excluir(@PathVariable Integer id) {
		filmeService.excluirPorId(id);
	}
	
	@PutMapping(value = "/{id}", consumes = "application/json")	
	public Filme atualizar(@RequestBody Filme filme1) {
		return filmeService.salvar(filme1);
	}

	
}
