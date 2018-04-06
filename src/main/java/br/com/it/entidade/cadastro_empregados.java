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
@Table(name = "cadastro_empregados", schema = "intellitown.dbo")
public class cadastro_empregados implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "bigint")
	private int id;
	@Column(columnDefinition = "bit")
	private boolean segunda;
	@Column(columnDefinition = "bit")
	private boolean terca;
	@Column(columnDefinition = "bit")
	private boolean quarta;
	@Column(columnDefinition = "bit")
	private boolean quinta;
	@Column(columnDefinition = "bit")
	private boolean sexta;
	@Column(columnDefinition = "bit")
	private boolean sabado;
	@Column(columnDefinition = "bit")
	private boolean domingo;
	@Column(columnDefinition = "time")
	private Date segunda_horario_inicial;
	@Column(columnDefinition = "time")
	private Date segunda_horario_final;
	@Column(columnDefinition = "time")
	private Date terca_horario_inicial;
	@Column(columnDefinition = "time")
	private Date tercaa_horario_final;
	@Column(columnDefinition = "time")
	private Date quarta_horario_inicial;
	@Column(columnDefinition = "time")
	private Date quarta_horario_final;
	@Column(columnDefinition = "time")
	private Date quinta_horario_inicial;
	@Column(columnDefinition = "time")
	private Date quinta_horario_final;
	@Column(columnDefinition = "time")
	private Date sexta_horario_inicial;
	@Column(columnDefinition = "time")
	private Date sexta_horario_final;
	@Column(columnDefinition = "time")
	private Date sabado_horario_inicial;
	@Column(columnDefinition = "time")
	private Date sabado_horario_final;
	@Column(columnDefinition = "time")
	private Date domingo_horario_inicial;
	@Column(columnDefinition = "time")
	private Date domingo_horario_final;
	@Column(columnDefinition = "bigint")
	private int cadastro;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isSegunda() {
		return segunda;
	}

	public void setSegunda(boolean segunda) {
		this.segunda = segunda;
	}

	public boolean isTerca() {
		return terca;
	}

	public void setTerca(boolean terca) {
		this.terca = terca;
	}

	public boolean isQuarta() {
		return quarta;
	}

	public void setQuarta(boolean quarta) {
		this.quarta = quarta;
	}

	public boolean isQuinta() {
		return quinta;
	}

	public void setQuinta(boolean quinta) {
		this.quinta = quinta;
	}

	public boolean isSexta() {
		return sexta;
	}

	public void setSexta(boolean sexta) {
		this.sexta = sexta;
	}

	public boolean isSabado() {
		return sabado;
	}

	public void setSabado(boolean sabado) {
		this.sabado = sabado;
	}

	public boolean isDomingo() {
		return domingo;
	}

	public void setDomingo(boolean domingo) {
		this.domingo = domingo;
	}

	public Date getSegunda_horario_inicial() {
		return segunda_horario_inicial;
	}

	public void setSegunda_horario_inicial(Date segunda_horario_inicial) {
		this.segunda_horario_inicial = segunda_horario_inicial;
	}

	public Date getSegunda_horario_final() {
		return segunda_horario_final;
	}

	public void setSegunda_horario_final(Date segunda_horario_final) {
		this.segunda_horario_final = segunda_horario_final;
	}

	public Date getTerca_horario_inicial() {
		return terca_horario_inicial;
	}

	public void setTerca_horario_inicial(Date terca_horario_inicial) {
		this.terca_horario_inicial = terca_horario_inicial;
	}

	public Date getTercaa_horario_final() {
		return tercaa_horario_final;
	}

	public void setTercaa_horario_final(Date tercaa_horario_final) {
		this.tercaa_horario_final = tercaa_horario_final;
	}

	public Date getQuarta_horario_inicial() {
		return quarta_horario_inicial;
	}

	public void setQuarta_horario_inicial(Date quarta_horario_inicial) {
		this.quarta_horario_inicial = quarta_horario_inicial;
	}

	public Date getQuarta_horario_final() {
		return quarta_horario_final;
	}

	public void setQuarta_horario_final(Date quarta_horario_final) {
		this.quarta_horario_final = quarta_horario_final;
	}

	public Date getQuinta_horario_inicial() {
		return quinta_horario_inicial;
	}

	public void setQuinta_horario_inicial(Date quinta_horario_inicial) {
		this.quinta_horario_inicial = quinta_horario_inicial;
	}

	public Date getQuinta_horario_final() {
		return quinta_horario_final;
	}

	public void setQuinta_horario_final(Date quinta_horario_final) {
		this.quinta_horario_final = quinta_horario_final;
	}

	public Date getSexta_horario_inicial() {
		return sexta_horario_inicial;
	}

	public void setSexta_horario_inicial(Date sexta_horario_inicial) {
		this.sexta_horario_inicial = sexta_horario_inicial;
	}

	public Date getSexta_horario_final() {
		return sexta_horario_final;
	}

	public void setSexta_horario_final(Date sexta_horario_final) {
		this.sexta_horario_final = sexta_horario_final;
	}

	public Date getSabado_horario_inicial() {
		return sabado_horario_inicial;
	}

	public void setSabado_horario_inicial(Date sabado_horario_inicial) {
		this.sabado_horario_inicial = sabado_horario_inicial;
	}

	public Date getSabado_horario_final() {
		return sabado_horario_final;
	}

	public void setSabado_horario_final(Date sabado_horario_final) {
		this.sabado_horario_final = sabado_horario_final;
	}

	public Date getDomingo_horario_inicial() {
		return domingo_horario_inicial;
	}

	public void setDomingo_horario_inicial(Date domingo_horario_inicial) {
		this.domingo_horario_inicial = domingo_horario_inicial;
	}

	public Date getDomingo_horario_final() {
		return domingo_horario_final;
	}

	public void setDomingo_horario_final(Date domingo_horario_final) {
		this.domingo_horario_final = domingo_horario_final;
	}

	public int getCadastro() {
		return cadastro;
	}

	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cadastro;
		result = prime * result + (domingo ? 1231 : 1237);
		result = prime * result + ((domingo_horario_final == null) ? 0 : domingo_horario_final.hashCode());
		result = prime * result + ((domingo_horario_inicial == null) ? 0 : domingo_horario_inicial.hashCode());
		result = prime * result + id;
		result = prime * result + (quarta ? 1231 : 1237);
		result = prime * result + ((quarta_horario_final == null) ? 0 : quarta_horario_final.hashCode());
		result = prime * result + ((quarta_horario_inicial == null) ? 0 : quarta_horario_inicial.hashCode());
		result = prime * result + (quinta ? 1231 : 1237);
		result = prime * result + ((quinta_horario_final == null) ? 0 : quinta_horario_final.hashCode());
		result = prime * result + ((quinta_horario_inicial == null) ? 0 : quinta_horario_inicial.hashCode());
		result = prime * result + (sabado ? 1231 : 1237);
		result = prime * result + ((sabado_horario_final == null) ? 0 : sabado_horario_final.hashCode());
		result = prime * result + ((sabado_horario_inicial == null) ? 0 : sabado_horario_inicial.hashCode());
		result = prime * result + (segunda ? 1231 : 1237);
		result = prime * result + ((segunda_horario_final == null) ? 0 : segunda_horario_final.hashCode());
		result = prime * result + ((segunda_horario_inicial == null) ? 0 : segunda_horario_inicial.hashCode());
		result = prime * result + (sexta ? 1231 : 1237);
		result = prime * result + ((sexta_horario_final == null) ? 0 : sexta_horario_final.hashCode());
		result = prime * result + ((sexta_horario_inicial == null) ? 0 : sexta_horario_inicial.hashCode());
		result = prime * result + (terca ? 1231 : 1237);
		result = prime * result + ((terca_horario_inicial == null) ? 0 : terca_horario_inicial.hashCode());
		result = prime * result + ((tercaa_horario_final == null) ? 0 : tercaa_horario_final.hashCode());
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
		cadastro_empregados other = (cadastro_empregados) obj;
		if (cadastro != other.cadastro)
			return false;
		if (domingo != other.domingo)
			return false;
		if (domingo_horario_final == null) {
			if (other.domingo_horario_final != null)
				return false;
		} else if (!domingo_horario_final.equals(other.domingo_horario_final))
			return false;
		if (domingo_horario_inicial == null) {
			if (other.domingo_horario_inicial != null)
				return false;
		} else if (!domingo_horario_inicial.equals(other.domingo_horario_inicial))
			return false;
		if (id != other.id)
			return false;
		if (quarta != other.quarta)
			return false;
		if (quarta_horario_final == null) {
			if (other.quarta_horario_final != null)
				return false;
		} else if (!quarta_horario_final.equals(other.quarta_horario_final))
			return false;
		if (quarta_horario_inicial == null) {
			if (other.quarta_horario_inicial != null)
				return false;
		} else if (!quarta_horario_inicial.equals(other.quarta_horario_inicial))
			return false;
		if (quinta != other.quinta)
			return false;
		if (quinta_horario_final == null) {
			if (other.quinta_horario_final != null)
				return false;
		} else if (!quinta_horario_final.equals(other.quinta_horario_final))
			return false;
		if (quinta_horario_inicial == null) {
			if (other.quinta_horario_inicial != null)
				return false;
		} else if (!quinta_horario_inicial.equals(other.quinta_horario_inicial))
			return false;
		if (sabado != other.sabado)
			return false;
		if (sabado_horario_final == null) {
			if (other.sabado_horario_final != null)
				return false;
		} else if (!sabado_horario_final.equals(other.sabado_horario_final))
			return false;
		if (sabado_horario_inicial == null) {
			if (other.sabado_horario_inicial != null)
				return false;
		} else if (!sabado_horario_inicial.equals(other.sabado_horario_inicial))
			return false;
		if (segunda != other.segunda)
			return false;
		if (segunda_horario_final == null) {
			if (other.segunda_horario_final != null)
				return false;
		} else if (!segunda_horario_final.equals(other.segunda_horario_final))
			return false;
		if (segunda_horario_inicial == null) {
			if (other.segunda_horario_inicial != null)
				return false;
		} else if (!segunda_horario_inicial.equals(other.segunda_horario_inicial))
			return false;
		if (sexta != other.sexta)
			return false;
		if (sexta_horario_final == null) {
			if (other.sexta_horario_final != null)
				return false;
		} else if (!sexta_horario_final.equals(other.sexta_horario_final))
			return false;
		if (sexta_horario_inicial == null) {
			if (other.sexta_horario_inicial != null)
				return false;
		} else if (!sexta_horario_inicial.equals(other.sexta_horario_inicial))
			return false;
		if (terca != other.terca)
			return false;
		if (terca_horario_inicial == null) {
			if (other.terca_horario_inicial != null)
				return false;
		} else if (!terca_horario_inicial.equals(other.terca_horario_inicial))
			return false;
		if (tercaa_horario_final == null) {
			if (other.tercaa_horario_final != null)
				return false;
		} else if (!tercaa_horario_final.equals(other.tercaa_horario_final))
			return false;
		return true;
	}

}
