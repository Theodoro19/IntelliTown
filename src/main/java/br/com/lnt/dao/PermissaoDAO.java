package br.com.lnt.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.lnt.entidade.permissao;
import br.com.lnt.util.JPAUtil;

public class PermissaoDAO extends LogGeralDAO {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;
	private Query query;

	public PermissaoDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(permissao p) {
		if (p.getId() == 0) {
			this.manager.persist(p);
		} else {
			this.manager.merge(p);
		}
	}

	public void excluir(permissao p) {
		Object c = this.manager.merge(p);
		this.manager.remove(c);
	}

	public permissao retornar(int id) {
		return this.manager.find(permissao.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<permissao> listarPermissao() {
		this.query = this.manager.createQuery("from permissao ");
		return this.query.getResultList();
	}
}
