package br.com.lnt.entidade;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "area_comum", schema = "lntintelligence.dbo")
public class area_comum implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "int")
	private int id;
	@Column(columnDefinition = "int")
	private int condominio;
	@Column(columnDefinition = "tinyint")
	private int grupo_area_comum;
	@Column(columnDefinition = "varchar(25)")
	private String nome_area_comum;
	@Column(columnDefinition = "numeric(12,2)")
	private double valor;
	@Column(columnDefinition = "tinyint")
	private int minimo_antecedencia;
	@Column(columnDefinition = "tinyint")
	private int maximo_antecedencia;
	@Column(columnDefinition = "tinyint")
	private int minimo_cancelamento;
	@Column(columnDefinition = "time")
	private Date hora_inicial;
	@Column(columnDefinition = "time")
	private Date hora_final;
	@Lob
	private byte[] termo_de_uso;
	@Lob
	private byte[] foto_area_comum;
	@Column(columnDefinition = "bit")
	private boolean lista_convidados_obrigatoria;
	@Column(columnDefinition = "tinyint")
	private int qtde_convidados;
	@Column(columnDefinition = "varchar(200)")
	private String msg_area_comum;

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

	public int getGrupo_area_comum() {
		return grupo_area_comum;
	}

	public void setGrupo_area_comum(int grupo_area_comum) {
		this.grupo_area_comum = grupo_area_comum;
	}

	public String getNome_area_comum() {
		return nome_area_comum;
	}

	public void setNome_area_comum(String nome_area_comum) {
		this.nome_area_comum = nome_area_comum;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getMinimo_antecedencia() {
		return minimo_antecedencia;
	}

	public void setMinimo_antecedencia(int minimo_antecedencia) {
		this.minimo_antecedencia = minimo_antecedencia;
	}

	public int getMaximo_antecedencia() {
		return maximo_antecedencia;
	}

	public void setMaximo_antecedencia(int maximo_antecedencia) {
		this.maximo_antecedencia = maximo_antecedencia;
	}

	public int getMinimo_cancelamento() {
		return minimo_cancelamento;
	}

	public void setMinimo_cancelamento(int minimo_cancelamento) {
		this.minimo_cancelamento = minimo_cancelamento;
	}

	public Date getHora_inicial() {
		return hora_inicial;
	}

	public void setHora_inicial(Date hora_inicial) {
		this.hora_inicial = hora_inicial;
	}

	public Date getHora_final() {
		return hora_final;
	}

	public void setHora_final(Date hora_final) {
		this.hora_final = hora_final;
	}

	public byte[] getTermo_de_uso() {
		return termo_de_uso;
	}

	public void setTermo_de_uso(byte[] termo_de_uso) {
		this.termo_de_uso = termo_de_uso;
	}

	public byte[] getFoto_area_comum() {
		return foto_area_comum;
	}

	public void setFoto_area_comum(byte[] foto_area_comum) {
		this.foto_area_comum = foto_area_comum;
	}

	public boolean isLista_convidados_obrigatoria() {
		return lista_convidados_obrigatoria;
	}

	public void setLista_convidados_obrigatoria(boolean lista_convidados_obrigatoria) {
		this.lista_convidados_obrigatoria = lista_convidados_obrigatoria;
	}

	public int getQtde_convidados() {
		return qtde_convidados;
	}

	public void setQtde_convidados(int qtde_convidados) {
		this.qtde_convidados = qtde_convidados;
	}

	public String getMsg_area_comum() {
		return msg_area_comum;
	}

	public void setMsg_area_comum(String msg_area_comum) {
		this.msg_area_comum = msg_area_comum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + condominio;
		result = prime * result + Arrays.hashCode(foto_area_comum);
		result = prime * result + grupo_area_comum;
		result = prime * result + ((hora_final == null) ? 0 : hora_final.hashCode());
		result = prime * result + ((hora_inicial == null) ? 0 : hora_inicial.hashCode());
		result = prime * result + id;
		result = prime * result + (lista_convidados_obrigatoria ? 1231 : 1237);
		result = prime * result + maximo_antecedencia;
		result = prime * result + minimo_antecedencia;
		result = prime * result + minimo_cancelamento;
		result = prime * result + ((msg_area_comum == null) ? 0 : msg_area_comum.hashCode());
		result = prime * result + ((nome_area_comum == null) ? 0 : nome_area_comum.hashCode());
		result = prime * result + qtde_convidados;
		result = prime * result + Arrays.hashCode(termo_de_uso);
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		area_comum other = (area_comum) obj;
		if (condominio != other.condominio)
			return false;
		if (!Arrays.equals(foto_area_comum, other.foto_area_comum))
			return false;
		if (grupo_area_comum != other.grupo_area_comum)
			return false;
		if (hora_final == null) {
			if (other.hora_final != null)
				return false;
		} else if (!hora_final.equals(other.hora_final))
			return false;
		if (hora_inicial == null) {
			if (other.hora_inicial != null)
				return false;
		} else if (!hora_inicial.equals(other.hora_inicial))
			return false;
		if (id != other.id)
			return false;
		if (lista_convidados_obrigatoria != other.lista_convidados_obrigatoria)
			return false;
		if (maximo_antecedencia != other.maximo_antecedencia)
			return false;
		if (minimo_antecedencia != other.minimo_antecedencia)
			return false;
		if (minimo_cancelamento != other.minimo_cancelamento)
			return false;
		if (msg_area_comum == null) {
			if (other.msg_area_comum != null)
				return false;
		} else if (!msg_area_comum.equals(other.msg_area_comum))
			return false;
		if (nome_area_comum == null) {
			if (other.nome_area_comum != null)
				return false;
		} else if (!nome_area_comum.equals(other.nome_area_comum))
			return false;
		if (qtde_convidados != other.qtde_convidados)
			return false;
		if (!Arrays.equals(termo_de_uso, other.termo_de_uso))
			return false;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}

}
