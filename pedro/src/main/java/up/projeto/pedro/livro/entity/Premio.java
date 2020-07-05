package up.projeto.pedro.livro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Premio")
public class Premio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdPremio")
	private Integer IdPremio;
	
	@Column(name = "Descricao")
	private String Descricao;
	
	public Premio() {
		
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
	

}
