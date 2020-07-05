package up.projeto.pedro.livro.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import up.projeto.pedro.livro.entity.PremioFilme;
import up.projeto.pedro.livro.repository.PremioFilmeRepository;
import up.projeto.pedro.livro.repository.LivroRepository;

@Service
public class PremioFilmeService {

	@Autowired
	private PremioFilmeRepository premioFilmeRep;
	
	@Transactional
	public PremioFilme salvar(PremioFilme premioFilme) {
		return premioFilmeRep.save(premioFilme);
	}
	
	public List<PremioFilme> listar() {
		return premioFilmeRep.findAll();	
	}
	
	public void excluir(PremioFilme premioFilme) {
		premioFilmeRep.delete(premioFilme);
	}
	
	public PremioFilme buscarPorId(Integer id) {
		return premioFilmeRep.findById(id).get();
	}
	
}
