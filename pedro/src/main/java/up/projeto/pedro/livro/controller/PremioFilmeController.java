package up.projeto.pedro.livro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import up.projeto.pedro.livro.entity.PremioFilme;
import up.projeto.pedro.livro.entity.Livro;
import up.projeto.pedro.livro.service.PremioFilmeService;
import up.projeto.pedro.livro.service.LivroService;

@RestController
@RequestMapping("/premioFilme")
public class PremioFilmeController {

	@Autowired
	private PremioFilmeService premioFilmeService;
	
	@PostMapping(consumes = "application/json")
	public PremioFilme premioFilme(@RequestBody PremioFilme premioFilme) {
		return premioFilmeService.salvar(premioFilme);
	}

	
	@GetMapping(produces = "application/json")
	public List<PremioFilme> listar(){
		return premioFilmeService.listar();
	}
	
}
