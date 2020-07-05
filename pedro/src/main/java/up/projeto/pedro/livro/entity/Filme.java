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
	public Integer IdFilme;
	
	@Column(name = "Titulo")
	public String Titulo;
	
	@Column(name = "Sinopse")
	public String Sinopse;
	
	@Column(name = "Data")			///VERIFICAR SE NAO DA ERRO DE VARIAVEL
	public String DataLancamento;
	
	@Column(name = "Genero")
	public String Genero;
	
	@Column(name = "Nacionalidade")
	public String Nacionalidade;
	
	@Column(name = "Estoque")
	public Integer Estoque;

	public Filme() {
		
	}
	
    public Filme(String titulo, String sinopse, String dataLancamento, String genero, String nacionalidade, Integer estoque)
    {
        Titulo = titulo;
        Sinopse = sinopse;
        DataLancamento = dataLancamento;
        Genero = genero;
        Nacionalidade = nacionalidade;
        Estoque = estoque;
    }
	
    //---------------------------------------GETTERS and SETTERS-----------------------------------
    
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

	public String getDataLancamento() {
		return DataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
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
