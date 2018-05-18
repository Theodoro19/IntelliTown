package br.com.lnt.entidade;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "cadastro_fotos", schema = "lntintelligence.dbo")
public class cadastro_fotos implements Serializable {

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
	@Lob
	private byte[] cadastro_foto;

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

	public byte[] getCadastro_foto() {
		return cadastro_foto;
	}

	public void setCadastro_foto(byte[] cadastro_foto) {
		this.cadastro_foto = cadastro_foto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cadastro;
		result = prime * result + Arrays.hashCode(cadastro_foto);
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
		cadastro_fotos other = (cadastro_fotos) obj;
		if (cadastro != other.cadastro)
			return false;
		if (!Arrays.equals(cadastro_foto, other.cadastro_foto))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

}
