package br.com.it.dao;

import javax.persistence.EntityManager;

import br.com.it.entidade.cadastro_empregados;
import br.com.it.util.JPAUtil;

public class CadastroEmpregadosDAO extends LogGeralDAO {
	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public CadastroEmpregadosDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(cadastro_empregados c) {
		if (c.getId() == 0) {
			this.manager.persist(c);
		} else {
			this.manager.merge(c);
		}
	}

	public void excluir(cadastro_empregados c) {
		Object x = this.manager.merge(c);
		this.manager.remove(x);
	}

	public cadastro_empregados retornar(int id) {
		return this.manager.find(cadastro_empregados.class, id);
	}
}
