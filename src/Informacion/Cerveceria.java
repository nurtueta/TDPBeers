package Informacion;

import java.io.File;

/**
 * Clase encargada de representar la cerveceria
 * @author Urtueta, Nahuel
 * @author Volpe, Leandro
 *
 */
public class Cerveceria{
	
	protected String nombre;
	protected String imagen;
	protected File archivoImagen;
	protected String archivoImagenNombre;
    protected String contentType;
	protected String direccion;
	protected int puntaje;
	protected String mejorVariedad;


	public String getArchivoImagenNombre() {
		return archivoImagenNombre;
	}

	public void setArchivoImagenNombre(String archivoImagenNombre) {
		this.archivoImagenNombre = archivoImagenNombre;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Cerveceria() {
	}

	public String getMejorVariedad() {
		return mejorVariedad;
	}

	public void setMejorVariedad(String mejorVariedad) {
		this.mejorVariedad = mejorVariedad;
	}
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
