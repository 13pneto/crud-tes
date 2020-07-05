package up.projeto.pedro.livro.entity;

import java.io.Serializable;
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
import javax.persistence.Table;

//@Entity
//@Table(name = "TB_Pessoa")
public class Pessoa{

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.AUTO)
	 * 
	 * @Column(name = "IdPessoa")
	 */
	private Integer IdPessoa;
	
	@Column(name = "Nome")
	private String Nome;
	
	
	@Column(name = "Cpf")
	private String Cpf;
	
	
	@Column(name = "Status")
	private Boolean Status;
	
	@Column(name = "CriadoEm")
	private Date CriadoEm;
	
	
	
	//Construtor vazio para deixar true qualquer nova pessoa
	public Pessoa() {
		Status = true;
		CriadoEm = new Date();
	}
	
	//Construtor
	public Pessoa(String nome, String cpf, Boolean status) {
        this.Nome = nome;
        this.Cpf = cpf;
        this.Status = status;
	}
	
	
	@Override
	public String  toString() {
		return this.Nome;
	}

//---------------------------------------GETTERS and SETTERS-----------------------------------
    

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

	public Integer getIdPessoa() {
		return IdPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		IdPessoa = idPessoa;
	}

	
	
}