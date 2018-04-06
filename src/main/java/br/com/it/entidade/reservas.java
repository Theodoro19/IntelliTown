package br.com.it.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservas", schema = "intellitown.dbo")
public class reservas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "bigint")
	private int id;
	@Column(columnDefinition = "bigint")
	private int usuario;
	@Column(columnDefinition = "int")
	private int area_comum;
	@Column(columnDefinition = "date")
	private Date data_evento;
	@Column(columnDefinition = "varchar(100)")
	private String mensagem;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public int getArea_comum() {
		return area_comum;
	}

	public void setArea_comum(int area_comum) {
		this.area_comum = area_comum;
	}

	public Date getData_evento() {
		return data_evento;
	}

	public void setData_evento(Date data_evento) {
		this.data_evento = data_evento;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + area_comum;
		result = prime * result + ((data_evento == null) ? 0 : data_evento.hashCode());
		result = prime * result + id;
		result = prime * result + ((mensagem == null) ? 0 : mensagem.hashCode());
		result = prime * result + usuario;
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
		reservas other = (reservas) obj;
		if (area_comum != other.area_comum)
			return false;
		if (data_evento == null) {
			if (other.data_evento != null)
				return false;
		} else if (!data_evento.equals(other.data_evento))
			return false;
		if (id != other.id)
			return false;
		if (mensagem == null) {
			if (other.mensagem != null)
				return false;
		} else if (!mensagem.equals(other.mensagem))
			return false;
		if (usuario != other.usuario)
			return false;
		return true;
	}

}
