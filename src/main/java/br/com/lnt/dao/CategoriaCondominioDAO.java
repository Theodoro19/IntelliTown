package br.com.lnt.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.lnt.entidade.categoria_condominio;
import br.com.lnt.util.JPAUtil;

public class CategoriaCondominioDAO extends LogGeralDAO {
	private static final long serialVersionUID = 1L;

	private EntityManager manager;
	private Query query;

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

	@SuppressWarnings("unchecked")
	public List<categoria_condominio> listarCategorias() {
		this.query = this.manager.createQuery("from categoria_condominio ");
		return this.query.getResultList();
	}
}
