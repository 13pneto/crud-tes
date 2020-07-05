package up.projeto.pedro.livro.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import up.projeto.pedro.livro.entity.Filme;
import up.projeto.pedro.livro.repository.FilmeRepository;

@Service
public class FilmeService {

	@Autowired
	private FilmeRepository filmeRep;
	
	@Transactional
	public Filme salvar(Filme filme) {
		return filmeRep.save(filme);
	}
	
	public List<Filme> listar() {
		return filmeRep.findAll();	
	}
	
	public void excluir(Filme filme) {
		filmeRep.delete(filme);
	}
	
	public Filme buscarPorId(Integer id) {
		return filmeRep.findById(id).get();
	}
	
}
