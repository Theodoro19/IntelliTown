package br.com.it.managedbean;

import br.com.it.dao.PerfilDAO;
import br.com.it.entidade.perfil;

public class teste {

	public static void main(String[] args) {
		perfil p = new perfil();
		p.setDescricao("Administrador");
		PerfilDAO pdao = new PerfilDAO();
		pdao.salvar(p);
	}

}
