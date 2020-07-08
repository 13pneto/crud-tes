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
@Table(name = "TB_Funcionario")
public class Funcionario{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_id_funcionarios")
	@SequenceGenerator(name = "sequence_id_funcionarios", sequenceName = "sequence_funcionario")
	@Column(name = "IdFuncionario")
	private Integer IdFuncionario;
	
	@Column(name = "Nome")
	private String Nome;
	
	
	@Column(name = "Cpf")
	private String Cpf;
	
	
	@Column(name = "Status")
	private Boolean Status;
	
	@Column(name = "CriadoEm")
	private Date CriadoEm;
	
	@Column(name = "Salario")
	private Double Salario;
	
	@Column(name = "Comissao")
	private Double Comissao; //Em %
	
	public Funcionario() {
		CriadoEm = new Date();
	}
	
	public Funcionario(String nome, String cpf, Boolean status, Double salario, Double comissao) {
		this.Nome = nome;
		this.Cpf = cpf;
		this.Status = status;
		this.Salario = salario;
		this.Comissao = comissao;
	}
	

    //---------------------------------------GETTERS and SETTERS-----------------------------------
    
	
	public Integer getIdFuncionario() {
		return IdFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		IdFuncionario = idFuncionario;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}

	public Double getComissao() {
		return Comissao;
	}

	public void setComissao(Double comissao) {
		Comissao = comissao;
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
