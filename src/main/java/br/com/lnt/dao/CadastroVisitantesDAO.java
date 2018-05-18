package br.com.lnt.dao;

import javax.persistence.EntityManager;

import br.com.lnt.entidade.cadastro_visitantes;
import br.com.lnt.util.JPAUtil;

public class CadastroVisitantesDAO extends LogGeralDAO {
	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public CadastroVisitantesDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(cadastro_visitantes v) {
		if (v.getId() == 0) {
			this.manager.persist(v);
		} else {
			this.manager.merge(v);
		}
	}

	public void excluir(cadastro_visitantes v) {
		Object c = this.manager.merge(v);
		this.manager.remove(c);
	}

	public cadastro_visitantes retornar(int id) {
		return this.manager.find(cadastro_visitantes.class, id);
	}
}
