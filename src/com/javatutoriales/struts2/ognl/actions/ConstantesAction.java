package com.javatutoriales.struts2.ognl.actions;

import java.util.ArrayList;

import com.javatutoriales.struts2.ognl.modelo.Constantes;
import com.javatutoriales.struts2.ognl.modelo.Persona;
import com.opensymphony.xwork2.ActionSupport;

public class ConstantesAction extends ActionSupport
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6274435199626908665L;
	private String nombre ="Java Tutoriales";
	private Constantes constantes;
	private Persona persona;

	@Override
	public String execute() throws Exception
	{
		constantes = new Constantes();
		
		ArrayList<Persona> familiares = new ArrayList<Persona>();
		
		persona = new Persona();
		persona.setNombre("William Mendoza");
		persona.setGenero("femenino");
		
		Persona familiar = new Persona();
		familiar.setNombre("María olivia");
		familiar.setGenero("femenino");
		familiares.add(familiar);
		
		familiar = new Persona();
		familiar.setNombre("José Gilberto");
		familiar.setGenero("masculino");
		familiares.add(familiar);
		
		familiar = new Persona();
		familiar.setNombre("Dayana Carolina");
		familiar.setGenero("femenino");
		familiares.add(familiar);
		
		familiar = new Persona();
		familiar.setNombre("Jesús Gabriel");
		familiar.setGenero("masculino");
		familiares.add(familiar);
		
		persona.setFamiliares(familiares);
		
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

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
}
