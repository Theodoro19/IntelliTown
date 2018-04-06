package br.com.it.dao;

import javax.persistence.EntityManager;

import br.com.it.entidade.categoria_condominio;
import br.com.it.util.JPAUtil;

public class CategoriaCondominioDAO extends LogGeralDAO {
	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public CategoriaCondominioDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(categoria_condominio o) {
		this.manager.persist(o);
	}

	public void alterar(categoria_condominio o) {
		this.manager.merge(o);
	}

	public void excluir(categoria_condominio o) {
		Object c = this.manager.merge(o);
		this.manager.remove(c);
	}

	public categoria_condominio retornar(int id) {
		return this.manager.find(categoria_condominio.class, id);
	}
}
