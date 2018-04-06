package br.com.it.dao;

import javax.persistence.EntityManager;

import br.com.it.entidade.area_comum;
import br.com.it.util.JPAUtil;

public class AreaComumDAO extends LogGeralDAO {
	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public AreaComumDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(area_comum a) {
		if (a.getId() == 0) {
			this.manager.persist(a);
		} else {
			this.manager.merge(a);
		}
	}

	public void excluir(area_comum a) {
		Object c = this.manager.merge(a);
		this.manager.remove(c);
	}

	public area_comum retornar(int id) {
		return this.manager.find(area_comum.class, id);
	}

}
