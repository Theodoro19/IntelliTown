package br.com.lnt.managedbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.com.lnt.dao.PermissaoDAO;
import br.com.lnt.dao.UsuarioDAO;
import br.com.lnt.entidade.permissao;
import br.com.lnt.entidade.usuario;
import br.com.lnt.managedbean.SessaoMB;

@ViewScoped
@ManagedBean
public class UsuarioMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{SessaoMB}")
	private SessaoMB sessaoMB;

	private usuario usuario = new usuario();
	private permissao permissao = new permissao();
	private List<usuario> listaUsuario;
	private List<permissao> listarPermissoes;

	public usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(usuario usuario) {
		this.usuario = usuario;
	}

	public permissao getPermissao() {
		return permissao;
	}

	public void setPermissao(permissao permissao) {
		this.permissao = permissao;
	}

	public List<usuario> getListaUsuario() {
		UsuarioDAO dao = new UsuarioDAO();
		this.listaUsuario = dao.listarTodosOsUsuarios();
		return listaUsuario;
	}

	public void setListaUsuario(List<usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	public List<permissao> getListarPermissoes() {
		PermissaoDAO dao = new PermissaoDAO();
		this.listarPermissoes = dao.listarPermissao();
		return listarPermissoes;
	}

	public void setListarPermissoes(List<permissao> listarPermissoes) {
		this.listarPermissoes = listarPermissoes;
	}

	public SessaoMB getSessaoMB() {
		return sessaoMB;
	}

	public void setSessaoMB(SessaoMB sessaoMB) {
		this.sessaoMB = sessaoMB;
	}

	public void salvarUsuario() {
		UsuarioDAO dao = new UsuarioDAO();
		dao.salvar(this.usuario);
	}

	public void salvarPermissao() {
		PermissaoDAO dao = new PermissaoDAO();
		dao.salvar(this.permissao);
	}
}
