package up.projeto.pedro.livro.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import up.projeto.pedro.livro.entity.ItemFilme;
import up.projeto.pedro.livro.repository.ItemFilmeRepository;

@Service
public class ItemFilmeService {

	@Autowired
	private ItemFilmeRepository itemFilmeRep;
	
	@Transactional
	public ItemFilme salvar(ItemFilme itemFilme) {
		return itemFilmeRep.save(itemFilme);
	}
	
	public List<ItemFilme> listar() {
		return itemFilmeRep.findAll();	
	}
	
	public void excluir(ItemFilme itemFilme) {
		itemFilmeRep.delete(itemFilme);
	}
	
	public ItemFilme buscarPorId(Integer id) {
		return itemFilmeRep.findById(id).get();
	}
	
}
