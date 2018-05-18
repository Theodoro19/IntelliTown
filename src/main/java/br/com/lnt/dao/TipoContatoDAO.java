package br.com.lnt.dao;

import javax.persistence.EntityManager;

import br.com.lnt.entidade.tipo_contato;
import br.com.lnt.util.JPAUtil;

public class TipoContatoDAO extends LogGeralDAO {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public TipoContatoDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(tipo_contato t) {
		if (t.getId() == 0) {
			this.manager.persist(t);
		} else {
			this.manager.merge(t);
		}
	}

	public void excluir(tipo_contato t) {
		Object c = this.manager.merge(t);
		this.manager.remove(c);
	}

	public tipo_contato retornar(int id) {
		return this.manager.find(tipo_contato.class, id);
	}
}
