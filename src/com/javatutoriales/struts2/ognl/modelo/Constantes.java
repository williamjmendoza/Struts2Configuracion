package com.javatutoriales.struts2.ognl.modelo;

public class Constantes
{

	private String atributo = "Atributo de instancia";
	public final static String valor = "Variable estatica";
	
	private static enum Datos {PRIMERO, SEGUNDO, TERCERO; public String getDato(){return "Dato en enum";}};

	public String getAtributo(){
		return atributo;
	}
	
	public String metodoDeInstancia(){
		return "Metodo de instancia";
	}
	
	public String metodoDeInstancia(String mensaje){
		return mensaje;
	}
	
	public static String metodoEstatico(){
		return "Metodo estatico";
	}
	
	public static String metodoEstatico(String mensaje){
		return mensaje;
	}
	
}
