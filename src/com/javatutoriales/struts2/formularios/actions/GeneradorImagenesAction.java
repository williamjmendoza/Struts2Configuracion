package com.javatutoriales.struts2.formularios.actions;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import javax.imageio.ImageIO;

import com.opensymphony.xwork2.ActionSupport;

public class GeneradorImagenesAction extends ActionSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6023430777337828183L;
	private InputStream imagenDinamica;
	private String nombreArchivo;
	private long bytesArchivo;
	
	public InputStream getImagenDinamica(){
		return imagenDinamica;
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
		final int ANCHO_IMGEN = 260;
		final int ALTO_IMAGEN = 130;
		
		BufferedImage imagen = new BufferedImage(ANCHO_IMGEN, ALTO_IMAGEN, BufferedImage.TYPE_INT_RGB);
		
		for(int alto = 0; alto < ALTO_IMAGEN; alto++)
		{
			for(int ancho = 0; ancho < ANCHO_IMGEN; ancho++)
			{
				imagen.setRGB(ancho, alto, new Color((ancho*alto)%255, (ancho*alto)%255, (ancho*alto)%255,  255).getRGB());
			}
		}
		
		ByteArrayOutputStream bytesImagen = new ByteArrayOutputStream();
		ImageIO.write(imagen, "png", bytesImagen);
		
		imagenDinamica = new ByteArrayInputStream(bytesImagen.toByteArray());
		
		nombreArchivo = "imagen dinamica.png";
		bytesArchivo = bytesImagen.size();
		
		return SUCCESS;
	}
}
