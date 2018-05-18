package br.com.lnt.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.lnt.entidade.unidade;
import br.com.lnt.util.JPAUtil;

public class UnidadeDAO extends LogGeralDAO {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;
	private Query query;

	public UnidadeDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(unidade u) {
		if (u.getId() == 0) {
			this.manager.persist(u);
		} else {
			this.manager.merge(u);
		}
	}

	public void excluir(unidade u) {
		Object c = this.manager.merge(u);
		this.manager.remove(c);
	}

	public unidade retornar(int id) {
		return this.manager.find(unidade.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<unidade> listarUnidadesDoCondominio(int condominio) {
		this.query = this.manager.createQuery("from unidade where condominio = :p1 ");
		this.query.setParameter("p1", condominio);
		return this.query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<unidade> listarUnidadesDoCondominioPorBloco(int condominio, String bloco) {
		this.query = this.manager.createQuery("from unidade where condominio = :p1 and bloco = :p2 ");
		this.query.setParameter("p1", condominio);
		this.query.setParameter("p2", bloco);
		return this.query.getResultList();
	}
}
