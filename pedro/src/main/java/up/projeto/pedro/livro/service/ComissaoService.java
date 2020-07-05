package up.projeto.pedro.livro.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import up.projeto.pedro.livro.entity.Comissao;
import up.projeto.pedro.livro.repository.ComissaoRepository;

@Service
public class ComissaoService {

	@Autowired
	private ComissaoRepository comissaoRep;
	
	@Transactional
	public Comissao salvar(Comissao comissao) {
		return comissaoRep.save(comissao);
	}
	
	public List<Comissao> listar() {
		return comissaoRep.findAll();	
	}
	
	public void excluir(Comissao comissao) {
		comissaoRep.delete(comissao);
	}
	
	public Comissao buscarPorId(Integer id) {
		return comissaoRep.findById(id).get();
	}
	
}
