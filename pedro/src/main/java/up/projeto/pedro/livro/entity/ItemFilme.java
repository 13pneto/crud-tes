package up.projeto.pedro.livro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "TB_ItemFilme")
public class ItemFilme {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdItemFilme")
	private Integer IdItemFilme;
	
	//@Column(name = "Filme")
	@JoinColumn(name="idFilme")
	@ManyToOne//(fetch = FetchType.EAGER)
	private Filme Filme;
	
	@Column(name = "Quantidade")
	private Integer Quantidade;

	public Integer getIdItemFilme() {
		return IdItemFilme;
	}

	public void setIdItemFilme(Integer idItemFilme) {
		IdItemFilme = idItemFilme;
	}

	public Filme getFilme() {
		return Filme;
	}

	public void setFilme(Filme filme) {
		Filme = filme;
	}

	public Integer getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		Quantidade = quantidade;
	}
	
	
}
