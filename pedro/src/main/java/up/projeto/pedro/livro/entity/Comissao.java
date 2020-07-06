package up.projeto.pedro.livro.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Comissao")
public class Comissao {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_id_comissoes")
	@SequenceGenerator(name = "sequence_id_comissoes", sequenceName = "sequence_comissao")
	@Column(name = "IdComissao")
	private Integer IdComissao;
	
	@JoinColumn(name = "FK_Comissao")
	@OneToOne
	private Locacao Locacao;
	
	@Column(name = "ValorComissao")
	private Double ValorComissao;
	
	@Column(name = "Status")
	private Boolean Status;
	
	@Column(name = "CriadoEm")
	private Date CriadoEm;
	
	/*
	 * public Comissao() { Status = true; CriadoEm = new Date(); ValorComissao =
	 * (Locacao.Valor * Locacao.Funcionario.Comissao) / 100; }
	 */
	
	public Comissao() {
		CriadoEm = new Date();
	}

    public Comissao(Locacao l)
    {
        this.Locacao = l;
        Status = true;
        //CriadoEm = new Date();
        this.ValorComissao = (l.getValor() * l.getFuncionario().getComissao()) / 100;
    }

    //---------------------------------------GETTERS and SETTERS-----------------------------------
    
	public Integer getIdComissao() {
		return IdComissao;
	}

	public void setIdComissao(Integer idComissao) {
		IdComissao = idComissao;
	}

	public Locacao getLocacao() {
		return Locacao;
	}

	public void setLocacao(Locacao locacao) {
		Locacao = locacao;
	}

	public Double getValorComissao() {
		return ValorComissao;
	}

	public void setValorComissao(Double valorComissao) {
		ValorComissao = valorComissao;
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
