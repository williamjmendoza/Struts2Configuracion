package com.javatutoriales.struts2.formularios.modelo;

import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6419569513958894443L;
	private String nombre;
	private String username;
	private String password;
	private int edad;
	private Date fechaNacimiento;
	
	public Usuario(){
		
	}
	
	/**
	 * @param nombre
	 * @param username
	 * @param password
	 * @param edad
	 * @param fechaNacimiento
	 */
	public Usuario(String nombre, String username, String password, int edad, Date fechaNacimiento) {
		this.nombre = nombre;
		this.username = username;
		this.password = password;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
