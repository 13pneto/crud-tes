package up.projeto.pedro.livro.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PremioFilme")
public class PremioFilme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_id_premiosfilmes")
	@SequenceGenerator(name = "sequence_id_premiosfilmes", sequenceName = "sequence_premiofilme")
	@Column(name = "IdPremioFilme")
	private Integer IdPremioFilme;

	@JoinColumn(name = "FK_Premio")
	@ManyToOne
	private Premio Premio;

	@JoinColumn(name = "FK_Filme")
	@ManyToOne
	private Filme Filme;
	
	@Column(name = "Status")
	private Boolean Status;

	@Column(name = "CriadoEm")
	private Date CriadoEm;
	
	public PremioFilme() {
		CriadoEm = new Date();
	}
	//---------------------------------------GETTERS and SETTERS-----------------------------------
    
	
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

	public Boolean getStatus() {
		return Status;
	}

	public void setStatus(Boolean status) {
		Status = status;
	}

	public Date getCriadoEm() {
		return CriadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		CriadoEm = criadoEm;
	}

	
	

}
