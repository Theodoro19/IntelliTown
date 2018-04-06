package br.com.it.dao;

import javax.persistence.EntityManager;

import br.com.it.entidade.unidade;
import br.com.it.util.JPAUtil;

public class UnidadeDAO extends LogGeralDAO {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public UnidadeDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(unidade u) {
		if (u.getId() == 0) {
			this.manager.persist(u);
		} else {
			this.manager.merge(u);
		}
	}

	public void excluir(unidade u) {
		Object c = this.manager.merge(u);
		this.manager.remove(c);
	}

	public unidade retornar(int id) {
		return this.manager.find(unidade.class, id);
	}
}
