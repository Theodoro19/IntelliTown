package br.com.lnt.dao;

import javax.persistence.EntityManager;

import br.com.lnt.entidade.perfil;
import br.com.lnt.util.JPAUtil;

public class PerfilDAO extends LogGeralDAO {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public PerfilDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(perfil p) {
		if (p.getId() == 0) {
			this.manager.persist(p);
		} else {
			this.manager.merge(p);
		}
	}

	public void excluir(perfil p) {
		Object c = this.manager.merge(p);
		this.manager.remove(c);
	}

	public perfil retornar(int id) {
		return this.manager.find(perfil.class, id);
	}
}
