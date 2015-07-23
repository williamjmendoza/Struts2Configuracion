package com.javatutoriales.struts2.formularios.actions;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

public class CargaArchivoAction extends ActionSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2088057304401618465L;
	private String autor;
	private File archivo;
	private String archivoFileName;
	private String archivoContentType;
	
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
		File nuevoArchivo = new File("/", archivoFileName);
		System.out.println(nuevoArchivo.getAbsolutePath());
		archivo.renameTo(nuevoArchivo);
		
		return SUCCESS;
	}
}
