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
@Table(name = "condominio", schema = "intellitown.dbo")
public class condominio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "int")
	private int condominio;
	@Column(columnDefinition = "varchar(50)")
	private String nome;
	@Column(columnDefinition = "char(5)")
	private String logradouro;
	@Column(columnDefinition = "varchar(50)")
	private String endereco;
	@Column(columnDefinition = "int")
	private int numero;
	@Column(columnDefinition = "varchar(20)")
	private String complemento;
	@Column(columnDefinition = "varchar(11)")
	private String cep;
	@Column(columnDefinition = "varchar(35)")
	private String cidade;
	@Column(columnDefinition = "varchar(20)")
	private String estado;
	@Column(columnDefinition = "tinyint")
	private int qtde_aptos;
	@Column(columnDefinition = "tinyint")
	private int qtde_garagens;
	@Column(columnDefinition = "tinyint")
	private int qtde_lojas;
	@Column(columnDefinition = "tinyint")
	private int qtde_cjtos;
	@Column(columnDefinition = "tinyint")
	private int qtde_blocos;
	@Column(columnDefinition = "varchar(20)")
	private String cnpj;
	@Column(columnDefinition = "datetime")
	private Date data_cadastro;
	@Column(columnDefinition = "datetime")
	private Date data_baixa;
	@Column(columnDefinition = "tinyint")
	private int tipo_condominio;
	@Column(columnDefinition = "char(4)")
	private String categoria_condominio;

	public int getCondominio() {
		return condominio;
	}

	public void setCondominio(int condominio) {
		this.condominio = condominio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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

	public int getQtde_aptos() {
		return qtde_aptos;
	}

	public void setQtde_aptos(int qtde_aptos) {
		this.qtde_aptos = qtde_aptos;
	}

	public int getQtde_garagens() {
		return qtde_garagens;
	}

	public void setQtde_garagens(int qtde_garagens) {
		this.qtde_garagens = qtde_garagens;
	}

	public int getQtde_lojas() {
		return qtde_lojas;
	}

	public void setQtde_lojas(int qtde_lojas) {
		this.qtde_lojas = qtde_lojas;
	}

	public int getQtde_cjtos() {
		return qtde_cjtos;
	}

	public void setQtde_cjtos(int qtde_cjtos) {
		this.qtde_cjtos = qtde_cjtos;
	}

	public int getQtde_blocos() {
		return qtde_blocos;
	}

	public void setQtde_blocos(int qtde_blocos) {
		this.qtde_blocos = qtde_blocos;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public Date getData_baixa() {
		return data_baixa;
	}

	public void setData_baixa(Date data_baixa) {
		this.data_baixa = data_baixa;
	}

	public int getTipo_condominio() {
		return tipo_condominio;
	}

	public void setTipo_condominio(int tipo_condominio) {
		this.tipo_condominio = tipo_condominio;
	}

	public String getCategoria_condominio() {
		return categoria_condominio;
	}

	public void setCategoria_condominio(String categoria_condominio) {
		this.categoria_condominio = categoria_condominio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria_condominio == null) ? 0 : categoria_condominio.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + condominio;
		result = prime * result + ((data_baixa == null) ? 0 : data_baixa.hashCode());
		result = prime * result + ((data_cadastro == null) ? 0 : data_cadastro.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numero;
		result = prime * result + qtde_aptos;
		result = prime * result + qtde_blocos;
		result = prime * result + qtde_cjtos;
		result = prime * result + qtde_garagens;
		result = prime * result + qtde_lojas;
		result = prime * result + tipo_condominio;
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
		condominio other = (condominio) obj;
		if (categoria_condominio == null) {
			if (other.categoria_condominio != null)
				return false;
		} else if (!categoria_condominio.equals(other.categoria_condominio))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (condominio != other.condominio)
			return false;
		if (data_baixa == null) {
			if (other.data_baixa != null)
				return false;
		} else if (!data_baixa.equals(other.data_baixa))
			return false;
		if (data_cadastro == null) {
			if (other.data_cadastro != null)
				return false;
		} else if (!data_cadastro.equals(other.data_cadastro))
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
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero != other.numero)
			return false;
		if (qtde_aptos != other.qtde_aptos)
			return false;
		if (qtde_blocos != other.qtde_blocos)
			return false;
		if (qtde_cjtos != other.qtde_cjtos)
			return false;
		if (qtde_garagens != other.qtde_garagens)
			return false;
		if (qtde_lojas != other.qtde_lojas)
			return false;
		if (tipo_condominio != other.tipo_condominio)
			return false;
		return true;
	}

}
