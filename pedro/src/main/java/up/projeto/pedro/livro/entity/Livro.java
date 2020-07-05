package up.projeto.pedro.livro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Livro")
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdLivro")
	public Integer IdLivro;
	
	@Column(name = "Titulo")
	public String titulo;	
	
	public Integer IdLivro() {
		return IdLivro;
	}
	
	public void setIdVeiculo(Integer idLivro) {
		this.IdLivro = idLivro;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	

	

}
