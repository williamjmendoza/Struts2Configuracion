package com.javatutoriales.struts2.formularios.actions;

import java.util.Map;

import org.apache.struts2.interceptor.ParameterAware;

import com.opensymphony.xwork2.ActionSupport;

public class MultiplesParametrosAction extends ActionSupport implements ParameterAware
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4010756292299731512L;
	private Map<String, String[]> parametros;

	@Override
	public void setParameters(Map<String, String[]> parametros)
	{
		this.parametros = parametros;
	}
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public Map<String, String[]> getParametros(){
		return parametros;
	}
	

}
