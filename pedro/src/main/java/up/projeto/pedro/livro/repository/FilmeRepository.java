package up.projeto.pedro.livro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import up.projeto.pedro.livro.entity.Cliente;
import up.projeto.pedro.livro.entity.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Integer>{
	
	@Query(value = "SELECT * FROM tb_filme f where f.titulo = :titulo", nativeQuery = true)
	public Filme FindByTitle(@Param("titulo") String titulo);

}
