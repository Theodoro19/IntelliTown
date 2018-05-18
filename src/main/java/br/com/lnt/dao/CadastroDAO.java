package br.com.lnt.dao;

import javax.persistence.EntityManager;

import br.com.lnt.entidade.cadastro;
import br.com.lnt.util.JPAUtil;

public class CadastroDAO extends LogGeralDAO {
	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public CadastroDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(cadastro d) {
		if (d.getId() == 0) {
			this.manager.persist(d);
		} else {
			this.manager.merge(d);
		}
	}

	public void excluir(cadastro d) {
		Object c = this.manager.merge(d);
		this.manager.remove(c);
	}

	public cadastro retornar(int id) {
		return this.manager.find(cadastro.class, id);
	}
}
