package up.projeto.pedro.livro.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "TB_ItemFilme")
public class ItemFilme {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_id_itensfilme")
	@SequenceGenerator(name = "sequence_id_itensfilme", sequenceName = "sequence_itemfilme")
	@Column(name = "IdItemFilme")
	public Integer IdItemFilme;
	
	//@Column(name = "Filme")
	@JoinColumn(name="idFilme")
	@ManyToOne//(fetch = FetchType.EAGER)
	public Filme Filme;
	
	@Column(name = "Quantidade")
	public Integer Quantidade;

	@Column(name = "CriadoEm")
	public Date CriadoEm;
	
	public void ItemFilme() {
		CriadoEm = new Date();
	}
//---------------------------------------GETTERS and SETTERS-----------------------------------
    	
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

	public Date getCriadoEm() {
		return CriadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		CriadoEm = criadoEm;
	}
	
	
}
