package up.projeto.pedro.livro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import up.projeto.pedro.livro.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
}
