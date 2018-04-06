package br.com.it.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import br.com.it.entidade.log_geral;
import br.com.it.util.JPAUtil;

public class LogGeralDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	private EntityManager manager;

	public LogGeralDAO() {
		this.manager = JPAUtil.getManager();
	}

	public void salvar(log_geral lg) {
		this.manager.persist(lg);
	}
}
