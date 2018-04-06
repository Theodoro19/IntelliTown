package br.com.it.dao;

import javax.persistence.EntityManager;

import br.com.it.entidade.tipo_condominio;
import br.com.it.util.JPAUtil;

public class TipoCondominioDAO extends LogGeralDAO {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public TipoCondominioDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(tipo_condominio t) {
		if (t.getId() == 0) {
			this.manager.persist(t);
		} else {
			this.manager.merge(t);
		}
	}

	public void excluir(tipo_condominio t) {
		Object c = this.manager.merge(t);
		this.manager.remove(c);
	}

	public tipo_condominio retornar(int id) {
		return this.manager.find(tipo_condominio.class, id);
	}

}
