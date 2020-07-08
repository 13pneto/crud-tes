package up.projeto.pedro.livro.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Premio")
public class Premio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_id_premios")
	@SequenceGenerator(name = "sequence_id_premios", sequenceName = "sequence_premio")
	@Column(name = "IdPremio")
	private Integer IdPremio;
	
	@Column(name = "Descricao")
	private String Descricao;
	
	@Column(name = "CriadoEm")
	private Date CriadoEm;
	
	public Premio() {
		CriadoEm = new Date();
	}
	
	//---------------------------------------GETTERS and SETTERS-----------------------------------
    
	public Integer getIdPremio() {
		return IdPremio;
	}

	public void setIdPremio(Integer idPremio) {
		IdPremio = idPremio;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public Date getCriadoEm() {
		return CriadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		CriadoEm = criadoEm;
	}
	

}
