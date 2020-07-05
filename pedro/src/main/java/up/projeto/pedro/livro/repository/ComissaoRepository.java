package up.projeto.pedro.livro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import up.projeto.pedro.livro.entity.Comissao;

public interface ComissaoRepository extends JpaRepository<Comissao, Integer>{
	
}
