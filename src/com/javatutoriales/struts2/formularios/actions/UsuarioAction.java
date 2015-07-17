package com.javatutoriales.struts2.formularios.actions;

import java.util.Date;

import com.javatutoriales.struts2.formularios.modelo.Usuario;
import com.opensymphony.xwork2.ActionSupport;

public class UsuarioAction extends ActionSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8206829093867280048L;
	private String nombre;
	private String username;
	private String password;
	private int edad;
	private Date fechaNacimiento;
	private Usuario usuario;
	
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
	public Usuario getUsuario(){
		return usuario;
	}
	
	@Override
	public String execute() throws Exception
	{
		usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setUsername(username);
		usuario.setPassword(password);
		usuario.setEdad(edad);
		usuario.setFechaNacimiento(fechaNacimiento);
		
		return SUCCESS;
	}
	
}
