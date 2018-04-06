package br.com.it.dao;

import javax.persistence.EntityManager;

import br.com.it.entidade.bloco;
import br.com.it.util.JPAUtil;

public class BlocoDAO extends LogGeralDAO {
	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public BlocoDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(bloco b) {
		if (b.getId() == 0) {
			this.manager.persist(b);
		} else {
			this.manager.merge(b);
		}
	}

	public void excluir(bloco b) {
		Object c = this.manager.merge(b);
		this.manager.remove(c);
	}

	public bloco retornar(int id) {
		return this.manager.find(bloco.class, id);
	}

}
