package com.javatutoriales.struts2.ognl.actions;

import com.javatutoriales.struts2.ognl.modelo.Animal;
import com.javatutoriales.struts2.ognl.modelo.Persona;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class StackAction extends ActionSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2459956166525476922L;

	@Override
	public String execute() throws Exception
	{
		ValueStack stack = ActionContext.getContext().getValueStack();
		
		Animal animal = new Animal();
		animal.setNombre("Nombre del animal");
		animal.setRaza("Perro labrador");
		
		Persona persona = new Persona();
		persona.setNombre("Nombre de la persona");
		persona.setSalario("Realmente poco");
		
		stack.push(persona);
		stack.push(animal);
		
		return SUCCESS;
	}
	
}
