package br.com.lnt.managedbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.lnt.dao.UsuarioDAO;
import br.com.lnt.entidade.usuario;

@SessionScoped
@ManagedBean(name = "SessaoMB")
public class SessaoMB implements Serializable {

	private static final long serialVersionUID = 1L;

	// OBJETOS
	private usuario usuario = new usuario();

	// ATRIBUTOS
	private boolean logado;
	private List<usuario> listarUsuarios;

	// GET X SET
	public usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(usuario usuario) {
		this.usuario = usuario;
	}

	public boolean isLogado() {
		return logado;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
	}

	public List<usuario> getListarUsuarios() {
		UsuarioDAO dao = new UsuarioDAO();
		this.listarUsuarios = dao.listarTodosOsUsuarios();
		return listarUsuarios;
	}

	public void setListarUsuarios(List<usuario> listarUsuarios) {
		this.listarUsuarios = listarUsuarios;
	}

	// MÉTODOS

}
