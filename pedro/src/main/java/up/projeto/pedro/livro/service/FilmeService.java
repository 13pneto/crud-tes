package up.projeto.pedro.livro.service;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.istack.Nullable;

import up.projeto.pedro.livro.commom.exception.BusinessException;
import up.projeto.pedro.livro.commom.exception.BusinessExceptionCode;
import up.projeto.pedro.livro.entity.Filme;
import up.projeto.pedro.livro.repository.FilmeRepository;

@Service
public class FilmeService {

	@Autowired
	private FilmeRepository filmeRep;
	
	@Transactional
	public Filme salvar(Filme filme) {	
		if(verificaDuplicidadePorTitulo(filme)){
			BusinessExceptionCode codiErro = BusinessExceptionCode.ERR007;
			BusinessException b = new BusinessException(codiErro);
			throw b;
		}
		
		return filmeRep.save(filme);
	}
	
	public List<Filme> listar() {
		
		if(filmeRep.findAll().size() <= 0) { 	//Verifica se a lista não é vazia
			BusinessExceptionCode codiErro = BusinessExceptionCode.ERR005;
			BusinessException b = new BusinessException(codiErro);
			throw b;
		}
		return filmeRep.findAll();	
	}
	
	public void excluir(Filme filme) {
		try {
			
			filmeRep.delete(filme);
		} catch (Exception e) {
			BusinessExceptionCode codiErro = BusinessExceptionCode.ERR003;
			BusinessException b = new BusinessException(codiErro);
			throw b;
		}
	}
	
	public void excluirPorId(Integer id) {
		try {
		Filme f = buscarPorId(id);
		if(f.getCriadoEm() == null) {
			BusinessExceptionCode codiErro = BusinessExceptionCode.ERR004;
			BusinessException b = new BusinessException(codiErro);
			throw b;
		}
	
			filmeRep.delete(f);
		} catch (Exception e) {
			BusinessExceptionCode codiErro = BusinessExceptionCode.ERR003;
			BusinessException b = new BusinessException(codiErro);
			throw b;
		}
	}
	
	public Filme atualizar(Filme filme) {
		return filmeRep.save(filme);
	}
	
/**
 * 
 * @param Filme (Objeto)
 * @return boolean (True = OBJETO ENCONTRADO (DUPLICIDADE))
 */
	public boolean verificaDuplicidadePorTitulo(Filme f) {			//Verificar se um filme já esta cadastrado com um determinado titulo
		String teste = f.getTitulo();
		Filme temp = filmeRep.FindByTitle(f.getTitulo());
		if(temp == null) {	//verifica se o objeto encontrado existe (não é nulo)
			return false;	//objeto não encontrado, retorna FALSE
		}
		return true;		//objeto ENCONTRADO retorna TRUE
	}
	
	public Filme buscarPorId(Integer id) {
			return filmeRep.findById(id).get();
	}
}
