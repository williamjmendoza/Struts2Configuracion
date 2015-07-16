package com.javatutoriales.struts2.ognl.actions;

import com.javatutoriales.struts2.ognl.modelo.Constantes;
import com.opensymphony.xwork2.ActionSupport;

public class ConstantesAction extends ActionSupport
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6274435199626908665L;
	private String nombre ="Java Tutoriales";
	private Constantes constantes;

	@Override
	public String execute() throws Exception
	{
		constantes = new Constantes();
		
		return SUCCESS;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}
	
}
