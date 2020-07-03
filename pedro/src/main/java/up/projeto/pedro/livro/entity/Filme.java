package up.projeto.pedro.livro.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Filme")
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdFilme")
	private Integer IdFilme;
	
	@Column(name = "Titulo")
	private String Titulo;
	
	@Column(name = "Sinopse")
	private String Sinopse;
	
	@Column(name = "Data")			///VERIFICAR SE NAO DA ERRO DE VARIAVEL
	private Date DataLancamento;
	
	@Column(name = "Genero")
	private String Genero;
	
	@Column(name = "Nacionalidade")
	private String Nacionalidade;
	
	@Column(name = "Estoque")
	private Integer Estoque;

	public Integer getIdFilme() {
		return IdFilme;
	}

	public void setIdFilme(Integer idFilme) {
		IdFilme = idFilme;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getSinopse() {
		return Sinopse;
	}

	public void setSinopse(String sinopse) {
		Sinopse = sinopse;
	}

	public Date getDataLancamento() {
		return DataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		DataLancamento = dataLancamento;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getNacionalidade() {
		return Nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		Nacionalidade = nacionalidade;
	}

	public Integer getEstoque() {
		return Estoque;
	}

	public void setEstoque(Integer estoque) {
		Estoque = estoque;
	}
	
	
	
}
