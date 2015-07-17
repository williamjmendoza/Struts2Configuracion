package com.javatutoriales.struts2.ognl.modelo;

import java.util.List;

public class Persona
{
	private String nombre;
	private String salario;
	private String genero;
	private List<Persona> familiares;
		
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public String getGenero(){
		return genero;
	}
	public void setGenero(String genero){
		this.genero = genero;
	}
	public List<Persona> getFamiliares() {
		return familiares;
	}
	public void setFamiliares(List<Persona> familiares) {
		this.familiares = familiares;
	}
}