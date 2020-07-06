package up.projeto.pedro.livro.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import up.projeto.pedro.livro.entity.Premio;
import up.projeto.pedro.livro.repository.PremioRepository;

@Service
public class PremioService {

	@Autowired
	private PremioRepository premioRep;
	
	@Transactional
	public Premio salvar(Premio premio) {
		return premioRep.save(premio);
	}
	
	public List<Premio> listar() {
		return premioRep.findAll();	
	}
	
	public void excluir(Premio premio) {
		premioRep.delete(premio);
	}
	
	public Premio buscarPorId(Integer id) {
		return premioRep.findById(id).get();
	}
	
}
