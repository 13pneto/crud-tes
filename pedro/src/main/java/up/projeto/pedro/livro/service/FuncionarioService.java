package up.projeto.pedro.livro.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import up.projeto.pedro.livro.entity.Funcionario;
import up.projeto.pedro.livro.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRep;
	
	@Transactional
	public Funcionario salvar(Funcionario funcionario) {
		return funcionarioRep.save(funcionario);
	}
	
	public List<Funcionario> listar() {
		return funcionarioRep.findAll();	
	}
	
	public void excluir(Funcionario funcionario) {
		funcionarioRep.delete(funcionario);
	}
	
	public Funcionario buscarPorId(Integer id) {
		return funcionarioRep.findById(id).get();
	}
	
}
