package up.projeto.pedro.livro.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import up.projeto.pedro.livro.entity.Locacao;
import up.projeto.pedro.livro.repository.LocacaoRepository;

@Service
public class LocacaoService {

	@Autowired
	private LocacaoRepository locacaoRep;
	
	@Transactional
	public Locacao salvar(Locacao locacao) {
		return locacaoRep.save(locacao);
	}
	
	public List<Locacao> listar() {
		return locacaoRep.findAll();	
	}
	
	public void excluir(Locacao locacao) {
		locacaoRep.delete(locacao);
	}
	
	public Locacao buscarPorId(Integer id) {
		return locacaoRep.findById(id).get();
	}
	
}
