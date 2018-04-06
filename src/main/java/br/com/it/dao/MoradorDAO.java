package br.com.it.dao;

import javax.persistence.EntityManager;

import br.com.it.entidade.morador;
import br.com.it.util.JPAUtil;

public class MoradorDAO extends LogGeralDAO {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public MoradorDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(morador m) {
		if (m.getId() == 0) {
			this.manager.persist(m);
		} else {
			this.manager.merge(m);
		}
	}

	public void excluir(morador m) {
		Object c = this.manager.merge(m);
		this.manager.remove(c);
	}

	public morador retornar(int id) {
		return this.manager.find(morador.class, id);
	}
}
