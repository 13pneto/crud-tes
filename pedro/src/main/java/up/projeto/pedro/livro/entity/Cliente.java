package up.projeto.pedro.livro.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Cliente")
public class Cliente{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdCliente")
	public Integer IdCliente;
	
	@Column(name = "Nome")
	private String Nome;
	
	
	@Column(name = "Cpf")
	private String Cpf;
	
	
	@Column(name = "Status")
	private Boolean Status;
	
	@Column(name = "CriadoEm")
	private Date CriadoEm;
	
	public Cliente() {
		CriadoEm = new Date();
	}
	
    public Cliente(String nome, String cpf, Boolean status) {
		super();
		Nome = nome;
		Cpf = cpf;
		Status = status;
	}



	//---------------------------------------GETTERS and SETTERS-----------------------------------
    	
	public Integer getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(Integer idCliente) {
		IdCliente = idCliente;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
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
