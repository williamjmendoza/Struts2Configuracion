package com.javatutoriales.struts2.ognl.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DatosSessionAction extends ActionSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1113982905284419692L;

	@Override
	public String execute() throws Exception
	{
		ActionContext.getContext().getSession().put("datoSession", "Dato en la sesion");
		
		return SUCCESS;
	}
	
}
