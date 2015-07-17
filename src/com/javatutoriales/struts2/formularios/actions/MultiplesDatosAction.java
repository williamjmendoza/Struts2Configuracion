package com.javatutoriales.struts2.formularios.actions;

import com.opensymphony.xwork2.ActionSupport;

public class MultiplesDatosAction extends ActionSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9182825488602269161L;
	private String[] correos;
	private String nombre;
	
	public String[] getCorreos() {
		return correos;
	}
	public void setCorreos(String[] correos) {
		this.correos = correos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String execute() throws Exception
	{
		return SUCCESS;
	}

}
