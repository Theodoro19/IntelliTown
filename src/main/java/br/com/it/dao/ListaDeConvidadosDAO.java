package br.com.it.dao;

import javax.persistence.EntityManager;

import br.com.it.entidade.lista_de_convidados;
import br.com.it.util.JPAUtil;

public class ListaDeConvidadosDAO extends LogGeralDAO {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public ListaDeConvidadosDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(lista_de_convidados l) {
		if (l.getId() == 0) {
			this.manager.persist(l);
		} else {
			this.manager.merge(l);
		}
	}

	public void excluir(lista_de_convidados l) {
		Object c = this.manager.merge(l);
		this.manager.remove(c);
	}

	public lista_de_convidados retornar(int id) {
		return this.manager.find(lista_de_convidados.class, id);
	}
}
