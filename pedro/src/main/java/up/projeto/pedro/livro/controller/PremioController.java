package up.projeto.pedro.livro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import up.projeto.pedro.livro.entity.Premio;
import up.projeto.pedro.livro.entity.Livro;
import up.projeto.pedro.livro.service.PremioService;
import up.projeto.pedro.livro.service.LivroService;

@RestController
@RequestMapping("/premio")
public class PremioController {

	@Autowired
	private PremioService premioService;
	
	@PostMapping(consumes = "application/json")
	public Premio premio(@RequestBody Premio premio) {
		return premioService.salvar(premio);
	}

	
	@GetMapping(produces = "application/json")
	public List<Premio> listar(){
		return premioService.listar();
	}
	
}
