package up.projeto.pedro.livro.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import up.projeto.pedro.livro.entity.Livro;
import up.projeto.pedro.livro.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRep;
	
	public Livro salvar(Livro livro) {
		return livroRep.save(livro);
	}
	
	public List<Livro> listar() {
		return livroRep.findAll();
	
	}
	
}
