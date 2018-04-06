package br.com.it.dao;

import javax.persistence.EntityManager;

import br.com.it.entidade.cadastro_fotos;
import br.com.it.util.JPAUtil;

public class CadastroFotosDAO extends LogGeralDAO {
	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public CadastroFotosDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(cadastro_fotos f) {
		if (f.getId() == 0) {
			this.manager.persist(f);
		} else {
			this.manager.merge(f);
		}
	}

	public void excluir(cadastro_fotos f) {
		Object c = this.manager.merge(f);
		this.manager.remove(c);
	}

	public cadastro_fotos retornar(int id) {
		return this.manager.find(cadastro_fotos.class, id);
	}
}
