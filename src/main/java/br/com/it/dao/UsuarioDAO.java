package br.com.it.dao;

import javax.persistence.EntityManager;

import br.com.it.entidade.usuario;
import br.com.it.util.JPAUtil;

public class UsuarioDAO extends LogGeralDAO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public UsuarioDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(usuario u) {
		if (u.getUsuario() == 0) {
			this.manager.persist(u);
		} else {
			this.manager.merge(u);
		}
	}

	public void excluir(usuario u) {
		Object c = this.manager.merge(u);
		this.manager.remove(c);
	}

	public usuario retornar(int id) {
		return this.manager.find(usuario.class, id);
	}
}
