package up.projeto.pedro.livro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import up.projeto.pedro.livro.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	@Query(value = "SELECT * FROM TB_cliente c where c.cpf like %:cpf%", nativeQuery = true)
	public List<Cliente> findByCpf(@Param("cpf") String cpf);
	
	
}
