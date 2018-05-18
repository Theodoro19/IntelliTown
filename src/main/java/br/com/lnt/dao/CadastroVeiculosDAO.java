package br.com.lnt.dao;

import javax.persistence.EntityManager;

import br.com.lnt.entidade.cadastro_veiculos;
import br.com.lnt.util.JPAUtil;

public class CadastroVeiculosDAO extends LogGeralDAO {
	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public CadastroVeiculosDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(cadastro_veiculos v) {
		if (v.getId() == 0) {
			this.manager.persist(v);
		} else {
			this.manager.merge(v);
		}
	}

	public void excluir(cadastro_veiculos v) {
		Object c = this.manager.merge(v);
		this.manager.remove(c);
	}

	public cadastro_veiculos retornar(int id) {
		return this.manager.find(cadastro_veiculos.class, id);
	}
}
