package br.com.lnt.managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class CadastroMB implements Serializable {

	private static final long serialVersionUID = 1L;
	@ManagedProperty(value = "#{SessaoMB}")
	private SessaoMB sessaoMB;
}
