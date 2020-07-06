package up.projeto.pedro.livro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Livro")
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_id_livros")
	@SequenceGenerator(name = "sequence_id_livros", sequenceName = "sequence_livro")
	@Column(name = "IdLivro")
	public Integer IdLivro;
	
	@Column(name = "Titulo")
	public String titulo;	
	
	public Livro() {
		
	}
	


	

}
