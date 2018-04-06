package br.com.it.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cadastro", schema = "intellitown.dbo")
public class cadastro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "bigint")
	private int id;
	@Column(columnDefinition = "int")
	private int condominio;
	@Column(columnDefinition = "char(4)")
	private String bloco;
	@Column(columnDefinition = "char(6)")
	private String unidade;
	@Column(columnDefinition = "varchar(40)")
	private String nome;
	@Column(columnDefinition = "varchar(15)")
	private String rg;
	@Column(columnDefinition = "varchar(75)")
	private String email;
	@Column(columnDefinition = "varchar(20)")
	private String cnpj_cpf;
	@Column(columnDefinition = "varchar(20)")
	private String telefone_residencial;
	@Column(columnDefinition = "varchar(20)")
	private String telefone_comercial;
	@Column(columnDefinition = "varchar(20)")
	private String telefone_celular;
	@Column(columnDefinition = "int")
	private int perfil;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCondominio() {
		return condominio;
	}

	public void setCondominio(int condominio) {
		this.condominio = condominio;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnpj_cpf() {
		return cnpj_cpf;
	}

	public void setCnpj_cpf(String cnpj_cpf) {
		this.cnpj_cpf = cnpj_cpf;
	}

	public String getTelefone_residencial() {
		return telefone_residencial;
	}

	public void setTelefone_residencial(String telefone_residencial) {
		this.telefone_residencial = telefone_residencial;
	}

	public String getTelefone_comercial() {
		return telefone_comercial;
	}

	public void setTelefone_comercial(String telefone_comercial) {
		this.telefone_comercial = telefone_comercial;
	}

	public String getTelefone_celular() {
		return telefone_celular;
	}

	public void setTelefone_celular(String telefone_celular) {
		this.telefone_celular = telefone_celular;
	}

	public int getPerfil() {
		return perfil;
	}

	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bloco == null) ? 0 : bloco.hashCode());
		result = prime * result + ((cnpj_cpf == null) ? 0 : cnpj_cpf.hashCode());
		result = prime * result + condominio;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + perfil;
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		result = prime * result + ((telefone_celular == null) ? 0 : telefone_celular.hashCode());
		result = prime * result + ((telefone_comercial == null) ? 0 : telefone_comercial.hashCode());
		result = prime * result + ((telefone_residencial == null) ? 0 : telefone_residencial.hashCode());
		result = prime * result + ((unidade == null) ? 0 : unidade.hashCode());
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
		cadastro other = (cadastro) obj;
		if (bloco == null) {
			if (other.bloco != null)
				return false;
		} else if (!bloco.equals(other.bloco))
			return false;
		if (cnpj_cpf == null) {
			if (other.cnpj_cpf != null)
				return false;
		} else if (!cnpj_cpf.equals(other.cnpj_cpf))
			return false;
		if (condominio != other.condominio)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (perfil != other.perfil)
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (telefone_celular == null) {
			if (other.telefone_celular != null)
				return false;
		} else if (!telefone_celular.equals(other.telefone_celular))
			return false;
		if (telefone_comercial == null) {
			if (other.telefone_comercial != null)
				return false;
		} else if (!telefone_comercial.equals(other.telefone_comercial))
			return false;
		if (telefone_residencial == null) {
			if (other.telefone_residencial != null)
				return false;
		} else if (!telefone_residencial.equals(other.telefone_residencial))
			return false;
		if (unidade == null) {
			if (other.unidade != null)
				return false;
		} else if (!unidade.equals(other.unidade))
			return false;
		return true;
	}

}
