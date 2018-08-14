package Informacion;

public class Cerveceria {
	
	private String nombre;
	private String imagen;
	private String direccion;
	private String mejorVariedad;
	private int puntaje;

	public Cerveceria() {
		// TODO Auto-generated constructor stub
	}
	
	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}	
}
