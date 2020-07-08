package up.projeto.pedro.livro.entity;




import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Filme")
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_id_filmes")
	@SequenceGenerator(name = "sequence_id_filmes", sequenceName = "sequence_filme")
	@Column(name = "IdFilme")
	private Integer IdFilme;
	
	@Column(name = "Titulo")
	private String Titulo;
	
	@Column(name = "Sinopse")
	private String Sinopse;
	
	@Column(name = "Data")			///VERIFICAR SE NAO DA ERRO DE VARIAVEL
	private String DataLancamento;
	
	@Column(name = "Genero")
	private String Genero;
	
	@Column(name = "Nacionalidade")
	private String Nacionalidade;
	
	@Column(name = "Estoque")
	private Integer Estoque;
	
	@Column(name = "CriadoEm")
	private String CriadoEm;

	public Filme() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //Padrão da data
		Date data = new Date(); 
		CriadoEm = sdf.format(data); //Converte a data para String
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

	public String getCriadoEm() {
		return CriadoEm;
	}

	public void setCriadoEm(String criadoEm) {
		CriadoEm = criadoEm;
	}
	
	
	
}
