package br.com.lnt.dao;

import javax.persistence.EntityManager;

import br.com.lnt.entidade.reservas;
import br.com.lnt.util.JPAUtil;

public class ReservasDAO extends LogGeralDAO {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public ReservasDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(reservas r) {
		if (r.getId() == 0) {
			this.manager.persist(r);
		} else {
			this.manager.merge(r);
		}
	}

	public void excluir(reservas r) {
		Object c = this.manager.merge(r);
		this.manager.remove(c);
	}

	public reservas retornar(int id) {
		return this.manager.find(reservas.class, id);
	}
}
