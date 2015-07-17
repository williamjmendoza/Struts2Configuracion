package com.javatutoriales.struts2.formularios.actions;

import com.javatutoriales.struts2.formularios.modelo.Usuario;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UsuarioActionMD extends ActionSupport implements ModelDriven<Usuario>
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8690211668908603606L;

	private Usuario usuario = new Usuario();
	private int numero;
	
	@Override
	public Usuario getModel()
	{
		return usuario;
	}

	@Override
	public String execute() throws Exception
	{
		return SUCCESS;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
