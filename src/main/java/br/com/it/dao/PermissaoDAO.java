package br.com.it.dao;

import javax.persistence.EntityManager;

import br.com.it.entidade.permissao;
import br.com.it.util.JPAUtil;

public class PermissaoDAO extends LogGeralDAO {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public PermissaoDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(permissao p) {
		if (p.getId() == 0) {
			this.manager.persist(p);
		} else {
			this.manager.merge(p);
		}
	}

	public void excluir(permissao p) {
		Object c = this.manager.merge(p);
		this.manager.remove(c);
	}

	public permissao retornar(int id) {
		return this.manager.find(permissao.class, id);
	}
}
