package br.com.lnt.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cadastro_visitantes", schema = "lntintelligence.dbo")
public class cadastro_visitantes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "bigint")
	private int id;
	@Column(columnDefinition = "bigint")
	private int cadastro;
	@Column(columnDefinition = "datetime")
	private Date data_entrada;
	@Column(columnDefinition = "datetime")
	private Date data_saida;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCadastro() {
		return cadastro;
	}

	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}

	public Date getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(Date data_entrada) {
		this.data_entrada = data_entrada;
	}

	public Date getData_saida() {
		return data_saida;
	}

	public void setData_saida(Date data_saida) {
		this.data_saida = data_saida;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cadastro;
		result = prime * result + ((data_entrada == null) ? 0 : data_entrada.hashCode());
		result = prime * result + ((data_saida == null) ? 0 : data_saida.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		cadastro_visitantes other = (cadastro_visitantes) obj;
		if (cadastro != other.cadastro)
			return false;
		if (data_entrada == null) {
			if (other.data_entrada != null)
				return false;
		} else if (!data_entrada.equals(other.data_entrada))
			return false;
		if (data_saida == null) {
			if (other.data_saida != null)
				return false;
		} else if (!data_saida.equals(other.data_saida))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

}
