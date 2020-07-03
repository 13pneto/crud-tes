package up.projeto.pedro.livro.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Locacao")
public class Locacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdLocacao")
	private Integer IdLocacao;

	@JoinColumn(name = "FK_ItemFilmeFilmes")
	@OneToMany
	private List<ItemFilme> Filmes;

	@JoinColumn(name = "FK_Cliente")
	@OneToOne
	private Cliente Cliente;
	
	@JoinColumn(name = "FK_Funcionario")
	@ManyToOne
	private Funcionario Funcionario;

	@Column(name = "DataLocacao")
	private Date DataLocacao;

	@Column(name = "DataDevolucao")
	private Date DataDevolucao;
	
	@Column(name = "Valor")
	private Double Valor;
	
	@Column(name = "Status")
	private Boolean Status;

	


}
