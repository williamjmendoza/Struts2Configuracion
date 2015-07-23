package com.javatutoriales.struts2.formularios.actions;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class CargaArchivoAction extends ActionSupport implements ServletRequestAware
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2088057304401618465L;
	private String autor;
	private File archivo;
	private String archivoFileName;
	private String archivoContentType;
	private HttpServletRequest servletRequest;
	
	public void setArchivo(File archivo){
		this.archivo = archivo;
	}
	public String getAutor(){
		return autor;
	}
	public void setAutor(String autor){
		this.autor = autor;
	}
	public String getNombre(){
		return archivoFileName;
	}
	public String getRuta(){
		return archivo.getAbsolutePath();
	}
	public String getArchivoFileName() {
		return archivoFileName;
	}
	public void setArchivoFileName(String archivoFileName) {
		this.archivoFileName = archivoFileName;
	}
	public String getArchivoContentType() {
		return archivoContentType;
	}
	public void setArchivoContentType(String archivoContentType) {
		this.archivoContentType = archivoContentType;
	}
	@Override
	public String execute() throws Exception
	{
		String realPath = servletRequest.getSession().getServletContext().getRealPath("/");
		
		File nuevoArchivo = new File(realPath+"images/", archivoFileName);
		archivo.renameTo(nuevoArchivo);
		
		return SUCCESS;
	}
	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}
}
