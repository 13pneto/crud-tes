package up.projeto.pedro.livro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import up.projeto.pedro.livro.entity.Locacao;
import up.projeto.pedro.livro.entity.Livro;
import up.projeto.pedro.livro.service.LocacaoService;
import up.projeto.pedro.livro.service.LivroService;

@RestController
@RequestMapping("/locacao")
public class LocacaoController {

	@Autowired
	private LocacaoService locacaoService;
	
	@PostMapping(consumes = "application/json")
	public Locacao locacao(@RequestBody Locacao locacao) {
		return locacaoService.salvar(locacao);
	}

	
	@GetMapping(produces = "application/json")
	public List<Locacao> listar(){
		return locacaoService.listar();
	}
	
}
