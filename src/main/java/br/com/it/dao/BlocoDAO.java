package br.com.it.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.it.entidade.bloco;
import br.com.it.util.JPAUtil;

public class BlocoDAO extends LogGeralDAO {
	private static final long serialVersionUID = 1L;

	private EntityManager manager;
	private Query query;

	public BlocoDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(bloco b) {
		if (b.getId() == 0) {
			this.manager.persist(b);
		} else {
			this.manager.merge(b);
		}
	}

	public void excluir(bloco b) {
		Object c = this.manager.merge(b);
		this.manager.remove(c);
	}

	public bloco retornar(int id) {
		return this.manager.find(bloco.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<bloco> listarBlocoDoCondominio(int condominio){
		this.query = this.manager.createQuery("from bloco where condominio = :p1 ");
		this.query.setParameter("p1", condominio);
		return this.query.getResultList();
	}

}
