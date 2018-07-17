package Informacion;

import javax.swing.ImageIcon;

public class Cerveza {
	
	private String nombre;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private ImageIcon imagen;
	private String direccion;
	private String mejorVariedad;
	private String desc;
	private int puntaje;
	
	/*public Cerveza(ImageIcon im, String dir, String var, String d, int p)
	{
		imagen=im;
		direccion=dir;
		mejorVariedad=var;
		desc=d;
		puntaje=p;
	}*/

	public Cerveza() {
		// TODO Auto-generated constructor stub
	}
	public ImageIcon getImagen() {
		return imagen;
	}

	public void setImagen(ImageIcon imagen) {
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	
}
