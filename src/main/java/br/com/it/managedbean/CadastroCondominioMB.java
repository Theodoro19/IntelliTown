package br.com.it.managedbean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.com.it.dao.BlocoDAO;
import br.com.it.dao.CategoriaCondominioDAO;
import br.com.it.dao.CondominioDAO;
import br.com.it.dao.TipoCondominioDAO;
import br.com.it.dao.UnidadeDAO;
import br.com.it.entidade.bloco;
import br.com.it.entidade.categoria_condominio;
import br.com.it.entidade.condominio;
import br.com.it.entidade.tipo_condominio;
import br.com.it.entidade.unidade;
import br.com.it.managedbean.SessaoMB;

@ViewScoped
@ManagedBean
public class CadastroCondominioMB implements Serializable {

	private static final long serialVersionUID = 1L;
	// DEPENDENCIA
	@ManagedProperty(value = "#{SessaoMB}")
	private SessaoMB sessaoMB;

	// OBJETOS
	private condominio condominio = new condominio();
	private bloco bloco = new bloco();
	private unidade unidade = new unidade();
	private tipo_condominio tipo_condominio = new tipo_condominio();
	private categoria_condominio categoria_condominio = new categoria_condominio();
	// ATRIBUTOS
	private List<condominio> listarCondominios;
	private List<bloco> listarBlocosDoCondominio;
	private List<unidade> listarUnidadesDoCondominio;
	private List<tipo_condominio> listarTiposDeCondominios;
	private List<categoria_condominio> listarCategoriasDeCondominios;
	private int codigoCondominio;
	private String nomeBloco;

	// GET X SET
	public condominio getCondominio() {
		return condominio;
	}

	public void setCondominio(condominio condominio) {
		this.condominio = condominio;
	}

	public bloco getBloco() {
		return bloco;
	}

	public void setBloco(bloco bloco) {
		this.bloco = bloco;
	}

	public unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(unidade unidade) {
		this.unidade = unidade;
	}

	public tipo_condominio getTipo_condominio() {
		return tipo_condominio;
	}

	public void setTipo_condominio(tipo_condominio tipo_condominio) {
		this.tipo_condominio = tipo_condominio;
	}

	public categoria_condominio getCategoria_condominio() {
		return categoria_condominio;
	}

	public void setCategoria_condominio(categoria_condominio categoria_condominio) {
		this.categoria_condominio = categoria_condominio;
	}

	public List<condominio> getListarCondominios() {
		CondominioDAO dao = new CondominioDAO();
		this.listarCondominios = dao.listarTodosOsCondominios();
		return listarCondominios;
	}

	public void setListarCondominios(List<condominio> listarCondominios) {
		this.listarCondominios = listarCondominios;
	}

	public List<bloco> getListarBlocosDoCondominio() {
		if (this.codigoCondominio > 0) {
			BlocoDAO dao = new BlocoDAO();
			this.listarBlocosDoCondominio = dao.listarBlocoDoCondominio(this.codigoCondominio);
		}
		return listarBlocosDoCondominio;
	}

	public void setListarBlocosDoCondominio(List<bloco> listarBlocosDoCondominio) {
		this.listarBlocosDoCondominio = listarBlocosDoCondominio;
	}

	public List<unidade> getListarUnidadesDoCondominio() {
		if (this.codigoCondominio > 0) {
			UnidadeDAO dao = new UnidadeDAO();
			if (this.nomeBloco != null || !this.nomeBloco.isEmpty()) {
				this.listarUnidadesDoCondominio = dao.listarUnidadesDoCondominioPorBloco(this.codigoCondominio,
						this.nomeBloco);
			} else {
				this.listarUnidadesDoCondominio = dao.listarUnidadesDoCondominio(this.codigoCondominio);
			}
		}
		return listarUnidadesDoCondominio;
	}

	public void setListarUnidadesDoCondominio(List<unidade> listarUnidadesDoCondominio) {
		this.listarUnidadesDoCondominio = listarUnidadesDoCondominio;
	}

	public List<tipo_condominio> getListarTiposDeCondominios() {
		TipoCondominioDAO dao = new TipoCondominioDAO();
		this.listarTiposDeCondominios = dao.listarTiposDeCondominio();
		return listarTiposDeCondominios;
	}

	public void setListarTiposDeCondominios(List<tipo_condominio> listarTiposDeCondominios) {
		this.listarTiposDeCondominios = listarTiposDeCondominios;
	}

	public List<categoria_condominio> getListarCategoriasDeCondominios() {
		CategoriaCondominioDAO dao = new CategoriaCondominioDAO();
		this.listarCategoriasDeCondominios = dao.listarCategorias();
		return listarCategoriasDeCondominios;
	}

	public void setListarCategoriasDeCondominios(List<categoria_condominio> listarCategoriasDeCondominios) {
		this.listarCategoriasDeCondominios = listarCategoriasDeCondominios;
	}

	public int getCodigoCondominio() {
		return codigoCondominio;
	}

	public void setCodigoCondominio(int codigoCondominio) {
		this.codigoCondominio = codigoCondominio;
	}

	public String getNomeBloco() {
		return nomeBloco;
	}

	public void setNomeBloco(String nomeBloco) {
		this.nomeBloco = nomeBloco;
	}

	public SessaoMB getSessaoMB() {
		return sessaoMB;
	}

	public void setSessaoMB(SessaoMB sessaoMB) {
		this.sessaoMB = sessaoMB;
	}

	// MÉTODOS

	public void salvarCondominio() {
		CondominioDAO dao = new CondominioDAO();
		this.condominio.setTipo_condominio(this.tipo_condominio.getId());
		this.condominio.setCategoria_condominio(this.categoria_condominio.getCategoria());
		this.condominio.setData_cadastro(new Date());
		dao.salvar(this.condominio);
	}

	public void alterarCondominio() {
		if (this.condominio.getCondominio() != 0) {
			CondominioDAO dao = new CondominioDAO();
			dao.salvar(this.condominio);
		} else {
			this.salvarCondominio();
		}
	}

	public void excluirCondominio() {
		if (this.condominio.getCondominio() != 0) {
			CondominioDAO dao = new CondominioDAO();
			dao.baixarCondominio(this.condominio);
		}
	}

	public void salvarBloco() {
		BlocoDAO dao = new BlocoDAO();
		this.bloco.setCondominio(this.condominio.getCondominio());
		dao.salvar(this.bloco);
	}

	public void salvarUnidade() {
		UnidadeDAO dao = new UnidadeDAO();
		this.unidade.setBloco(this.bloco.getBloco());
		this.unidade.setCondominio(this.bloco.getCondominio());
		dao.salvar(this.unidade);
	}

	public void salvarTiposDeCondominio() {
		TipoCondominioDAO dao = new TipoCondominioDAO();
		dao.salvar(this.tipo_condominio);
	}
}
