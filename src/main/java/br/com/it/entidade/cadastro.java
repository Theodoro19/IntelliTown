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
	@Column(columnDefinition = "char(2)")
	private String tipo_pessoa;
	@Column(columnDefinition = "varchar(20)")
	private String cnpj_cpf;
	@Column(columnDefinition = "date")
	private Date data_nascimento;
	@Column(columnDefinition = "varchar(15)")
	private String nacionalidade;
	@Column(columnDefinition = "char(1)")
	private String sexo;
	@Column(columnDefinition = "varchar(75)")
	private String email;
	@Column(columnDefinition = "char(5)")
	private String logradouro;
	@Column(columnDefinition = "varchar(50)")
	private String endereco;
	@Column(columnDefinition = "int")
	private int numero;
	@Column(columnDefinition = "varchar(20)")
	private String complemento;
	@Column(columnDefinition = "varchar(35)")
	private String cidade;
	@Column(columnDefinition = "varchar(20)")
	private String estado;
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

	public String getTipo_pessoa() {
		return tipo_pessoa;
	}

	public void setTipo_pessoa(String tipo_pessoa) {
		this.tipo_pessoa = tipo_pessoa;
	}

	public String getCnpj_cpf() {
		return cnpj_cpf;
	}

	public void setCnpj_cpf(String cnpj_cpf) {
		this.cnpj_cpf = cnpj_cpf;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((cnpj_cpf == null) ? 0 : cnpj_cpf.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + condominio;
		result = prime * result + ((data_nascimento == null) ? 0 : data_nascimento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + id;
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + ((nacionalidade == null) ? 0 : nacionalidade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numero;
		result = prime * result + perfil;
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((telefone_celular == null) ? 0 : telefone_celular.hashCode());
		result = prime * result + ((telefone_comercial == null) ? 0 : telefone_comercial.hashCode());
		result = prime * result + ((telefone_residencial == null) ? 0 : telefone_residencial.hashCode());
		result = prime * result + ((tipo_pessoa == null) ? 0 : tipo_pessoa.hashCode());
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
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (cnpj_cpf == null) {
			if (other.cnpj_cpf != null)
				return false;
		} else if (!cnpj_cpf.equals(other.cnpj_cpf))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (condominio != other.condominio)
			return false;
		if (data_nascimento == null) {
			if (other.data_nascimento != null)
				return false;
		} else if (!data_nascimento.equals(other.data_nascimento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (id != other.id)
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (nacionalidade == null) {
			if (other.nacionalidade != null)
				return false;
		} else if (!nacionalidade.equals(other.nacionalidade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero != other.numero)
			return false;
		if (perfil != other.perfil)
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
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
		if (tipo_pessoa == null) {
			if (other.tipo_pessoa != null)
				return false;
		} else if (!tipo_pessoa.equals(other.tipo_pessoa))
			return false;
		if (unidade == null) {
			if (other.unidade != null)
				return false;
		} else if (!unidade.equals(other.unidade))
			return false;
		return true;
	}

}
