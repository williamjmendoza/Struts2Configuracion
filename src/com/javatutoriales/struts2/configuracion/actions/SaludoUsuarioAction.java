package com.javatutoriales.struts2.configuracion.actions;

import com.opensymphony.xwork2.ActionSupport;

public class SaludoUsuarioAction extends ActionSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8920187543531241189L;
	private String nombre;
	private int numero;
	private String mensaje;
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public String getMensaje(){
		return mensaje;
	}

	@Override
	public String execute() throws Exception
	{
		mensaje = "Bienvenido " + nombre + " al mundo de Struts 2. Tu numero de la suerte de hoy es " + numero;
		
		return SUCCESS;
	}
	
}
