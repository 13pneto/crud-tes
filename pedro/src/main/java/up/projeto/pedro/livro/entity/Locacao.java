package up.projeto.pedro.livro.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Locacao")
public class Locacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_id_locacoes")
	@SequenceGenerator(name = "sequence_id_locacoes", sequenceName = "sequence_locacao")
	@Column(name = "IdLocacao")
	private Integer IdLocacao;

	@JoinColumn(name = "FK_ItemFilmeFilmes")
	@OneToMany
	private List<ItemFilme> Filmes;

	@JoinColumn(name = "FK_Cliente")
	@ManyToOne
	private Cliente Cliente;
	
	@JoinColumn(name = "FK_Funcionario")
	@ManyToOne
	private Funcionario Funcionario;

	@Column(name = "DataLocacao")
	private Date DataLocacao;

	@Column(name = "DataDevolucao")
	private Date DataDevolucao;
	
	@Column(name = "DataDevolvida")
	private Date DataDevolvida;
	
	@Column(name = "Valor")
	private Double Valor;
	
	@Column(name = "Status")
	private Boolean Status;
	
	@Column(name = "CriadoEm")
	private Date CriadoEm;
	
    public Locacao()
    {
        CriadoEm = new Date();
        Status = true;
        DataDevolvida = null;
    }

//---------------------------------------GETTERS and SETTERS-----------------------------------
    
	public Integer getIdLocacao() {
		return IdLocacao;
	}

	public void setIdLocacao(Integer idLocacao) {
		IdLocacao = idLocacao;
	}

	public List<ItemFilme> getFilmes() {
		return Filmes;
	}

	public void setFilmes(List<ItemFilme> filmes) {
		Filmes = filmes;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return Funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		Funcionario = funcionario;
	}

	public Date getDataLocacao() {
		return DataLocacao;
	}

	public void setDataLocacao(Date dataLocacao) {
		DataLocacao = dataLocacao;
	}

	public Date getDataDevolucao() {
		return DataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		DataDevolucao = dataDevolucao;
	}

	public Date getDataDevolvida() {
		return DataDevolvida;
	}

	public void setDataDevolvida(Date dataDevolvida) {
		DataDevolvida = dataDevolvida;
	}

	public Double getValor() {
		return Valor;
	}

	public void setValor(Double valor) {
		Valor = valor;
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
