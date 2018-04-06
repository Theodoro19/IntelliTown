package br.com.it.dao;

import javax.persistence.EntityManager;

import br.com.it.entidade.condominio;
import br.com.it.util.JPAUtil;

public class CondominioDAO extends LogGeralDAO {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public CondominioDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(condominio c) {
		if (c.getCondominio() == 0) {
			this.manager.persist(c);
		} else {
			this.manager.merge(c);
		}
	}

	public void excluir(condominio c) {
		Object x = this.manager.merge(c);
		this.manager.remove(x);
	}

	public condominio retornar(int id) {
		return this.manager.find(condominio.class, id);
	}
}
