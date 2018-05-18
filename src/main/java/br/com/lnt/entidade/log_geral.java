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
@Table(name = "log_geral", schema = "lntintelligence.dbo")
public class log_geral implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "bigint")
	private int id;
	@Column(columnDefinition = "varchar(50)")
	private String ip;
	@Column(columnDefinition = "varchar(50)")
	private String feito_por;
	@Column(columnDefinition = "varchar(20)")
	private String tabela;
	@Column(columnDefinition = "bit")
	private boolean inserir;
	@Column(columnDefinition = "bit")
	private boolean alterar;
	@Column(columnDefinition = "bit")
	private boolean deletar;
	@Column(columnDefinition = "varchar(max)")
	private String info_anterior;
	@Column(columnDefinition = "datetime")
	private Date data;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (alterar ? 1231 : 1237);
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + (deletar ? 1231 : 1237);
		result = prime * result + ((feito_por == null) ? 0 : feito_por.hashCode());
		result = prime * result + id;
		result = prime * result + ((info_anterior == null) ? 0 : info_anterior.hashCode());
		result = prime * result + (inserir ? 1231 : 1237);
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result + ((tabela == null) ? 0 : tabela.hashCode());
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
		log_geral other = (log_geral) obj;
		if (alterar != other.alterar)
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (deletar != other.deletar)
			return false;
		if (feito_por == null) {
			if (other.feito_por != null)
				return false;
		} else if (!feito_por.equals(other.feito_por))
			return false;
		if (id != other.id)
			return false;
		if (info_anterior == null) {
			if (other.info_anterior != null)
				return false;
		} else if (!info_anterior.equals(other.info_anterior))
			return false;
		if (inserir != other.inserir)
			return false;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		if (tabela == null) {
			if (other.tabela != null)
				return false;
		} else if (!tabela.equals(other.tabela))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getFeito_por() {
		return feito_por;
	}

	public void setFeito_por(String feito_por) {
		this.feito_por = feito_por;
	}

	public String getTabela() {
		return tabela;
	}

	public void setTabela(String tabela) {
		this.tabela = tabela;
	}

	public boolean isInserir() {
		return inserir;
	}

	public void setInserir(boolean inserir) {
		this.inserir = inserir;
	}

	public boolean isAlterar() {
		return alterar;
	}

	public void setAlterar(boolean alterar) {
		this.alterar = alterar;
	}

	public boolean isDeletar() {
		return deletar;
	}

	public void setDeletar(boolean deletar) {
		this.deletar = deletar;
	}

	public String getInfo_anterior() {
		return info_anterior;
	}

	public void setInfo_anterior(String info_anterior) {
		this.info_anterior = info_anterior;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
