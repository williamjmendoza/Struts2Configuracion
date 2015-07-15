package com.javatutoriales.struts2.configuracion.actions;

import com.opensymphony.xwork2.ActionSupport;

public class SaludoAction extends ActionSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -423902036295344596L;
	private String mensaje;

	@Override
	public String execute()
	{
		mensaje = "Bienvenido al mundo de Struts 2";
		
		return SUCCESS;
	}
	
	public String getMensaje()
	{
		return mensaje;
	}

}
