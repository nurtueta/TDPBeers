package Informacion;

import org.apache.struts2.components.File;

public abstract class Local {
	protected String nombre;
	protected String imagen;
	protected File archivoImagen;
	protected String direccion;
	protected int puntaje;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public File getArchivoImagen() {
		return archivoImagen;
	}
	public void setArchivoImagen(File archivoImagen) {
		this.archivoImagen = archivoImagen;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

}
