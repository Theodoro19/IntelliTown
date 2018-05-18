package br.com.lnt.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.lnt.entidade.condominio;
import br.com.lnt.util.JPAUtil;

public class CondominioDAO extends LogGeralDAO {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;
	private Query query;

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

	public void baixarCondominio(condominio c) {
		this.query = this.manager
				.createNativeQuery("update condominio set data_baixa = GETDATE() where condominio = :p1 ");
		this.query.setParameter("p1", c.getCondominio());
		this.query.executeUpdate();
	}

	public condominio retornar(int id) {
		return this.manager.find(condominio.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<condominio> listarTodosOsCondominios() {
		this.query = this.manager.createQuery("from condominio ");
		return this.query.getResultList();
	}

}
