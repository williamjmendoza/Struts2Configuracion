package com.javatutoriales.struts2.formularios.actions;

import com.opensymphony.xwork2.ActionSupport;

public class ValidacionDatosAction extends ActionSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7657188416970643866L;
	private String nombre;
	private String username;
	private String password;
	private String email;
	private int edad;
	private String telefono;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String execute() throws Exception
	{
	    System.out.println("Nombre: " + nombre);
	    System.out.println("Username: " + username);
	    System.out.println("Password: " + password);
	    System.out.println("Email: " + email);
	    System.out.println("Edad: " + edad);
	    System.out.println("Telefono: " + telefono);
	        
	    return SUCCESS;
	}
	@Override
	public void validate()
	{
		if("programador".equals(username))
		{
			addFieldError("username", "El username seleccionado ya se encuentra acupado, por favor seleccione otro.");
		}

		if("programador@gmail.com".equals(email))
		{
			addFieldError("email", "El correo electrónico proporcionado ya ha sido registrado anteriormente.");
		}
	}
}
