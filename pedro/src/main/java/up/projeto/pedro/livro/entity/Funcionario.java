package up.projeto.pedro.livro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Funcionario")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdFuncionario")
	private Integer IdFuncionario;
	
	@Column(name = "Salario")
	private Double Salario;
	
	@Column(name = "Comissao")
	private Double Comissao;

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
	
	

}
