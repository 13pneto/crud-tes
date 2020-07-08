package up.projeto.pedro.livro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import up.projeto.pedro.livro.entity.ItemFilme;
import up.projeto.pedro.livro.entity.Livro;
import up.projeto.pedro.livro.service.ItemFilmeService;
import up.projeto.pedro.livro.service.LivroService;

@RestController
@RequestMapping("/itemFilme")
public class ItemFilmeController {

	@Autowired
	private ItemFilmeService itemFilmeService;
	
	@PostMapping(consumes = "application/json")
	public ItemFilme itemFilme(@RequestBody ItemFilme itemFilme) {
		return itemFilmeService.salvar(itemFilme);
	}

	
	@GetMapping(produces = "application/json")
	public List<ItemFilme> listar(){
		return itemFilmeService.listar();
	}
	
}
