package up.projeto.pedro.livro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdCliente")
	private Integer IdCliente;

	public Integer getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(Integer idCliente) {
		IdCliente = idCliente;
	}

}
