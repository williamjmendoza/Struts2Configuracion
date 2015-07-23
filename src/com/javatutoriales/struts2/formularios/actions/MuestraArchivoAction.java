package com.javatutoriales.struts2.formularios.actions;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class MuestraArchivoAction extends ActionSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4695373519730654374L;
	private InputStream inputStream;
	
	public InputStream getInputStream(){
		return inputStream;
	}

	@Override
	public String execute() throws Exception
	{
		String ruta = ServletActionContext.getServletContext().getRealPath("/archivos/struts2_tutorial.pdf");
		
		inputStream = new FileInputStream(ruta);
		
		return SUCCESS;
	}
}
