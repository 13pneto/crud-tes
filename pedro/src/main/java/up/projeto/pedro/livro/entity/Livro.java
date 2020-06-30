package up.projeto.pedro.livro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.repository.CrudRepository;

@Entity
@Table(name = "TB_Livro")
public class Livro {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "IdLivro")
private Integer IdLivro;

public Integer getIdVeiculo() {
	return IdLivro;
}

public void setIdVeiculo(Integer idVeiculo) {
	this.IdLivro = idVeiculo;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

@Column(name = "Titulo")
private String titulo;	
	
}
