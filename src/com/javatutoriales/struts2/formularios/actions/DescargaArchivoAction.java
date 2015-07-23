package com.javatutoriales.struts2.formularios.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DescargaArchivoAction extends ActionSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7019706087863246636L;
	private InputStream inputStream;
	private String nombreArchivo;
	private long bytesArchivo;
	
	public InputStream getInputStream(){
		return inputStream;
	}
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	public long getBytesArchivo(){
		return bytesArchivo;
	}
	@Override
	public String execute() throws Exception
	{
		String ruta = ServletActionContext.getServletContext().getRealPath("/archivos/struts2_tutorial.pdf");
		
		File archivo = new File(ruta);
		
		nombreArchivo = archivo.getName();
		bytesArchivo = archivo.length();
		
		inputStream = new FileInputStream(archivo);
		
		return SUCCESS;
	}
}
