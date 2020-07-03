package up.projeto.pedro.livro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PremioFilme")
public class PremioFilme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdPremioFilme")
	private Integer IdPremioFilme;

	@JoinColumn(name = "FK_Premio")
	@OneToOne
	private Premio Premio;

	@JoinColumn(name = "FK_Filme")
	@ManyToOne
	private Filme Filme;

	public Integer getIdPremioFilme() {
		return IdPremioFilme;
	}

	public void setIdPremioFilme(Integer idPremioFilme) {
		IdPremioFilme = idPremioFilme;
	}

	public Premio getPremio() {
		return Premio;
	}

	public void setPremio(Premio premio) {
		Premio = premio;
	}

	public Filme getFilme() {
		return Filme;
	}

	public void setFilme(Filme filme) {
		Filme = filme;
	}

	

}
