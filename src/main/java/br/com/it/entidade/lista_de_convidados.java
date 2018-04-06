package br.com.it.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lista_de_convidados", schema = "intellitown.dbo")
public class lista_de_convidados implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "bigint")
	private int id;
	@Column(columnDefinition = "int")
	private int reserva;
	@Column(columnDefinition = "varchar(40)")
	private String nome_convidado;
	@Column(columnDefinition = "varchar(15)")
	private String rg;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getReserva() {
		return reserva;
	}

	public void setReserva(int reserva) {
		this.reserva = reserva;
	}

	public String getNome_convidado() {
		return nome_convidado;
	}

	public void setNome_convidado(String nome_convidado) {
		this.nome_convidado = nome_convidado;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nome_convidado == null) ? 0 : nome_convidado.hashCode());
		result = prime * result + reserva;
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
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
		lista_de_convidados other = (lista_de_convidados) obj;
		if (id != other.id)
			return false;
		if (nome_convidado == null) {
			if (other.nome_convidado != null)
				return false;
		} else if (!nome_convidado.equals(other.nome_convidado))
			return false;
		if (reserva != other.reserva)
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		return true;
	}

}
