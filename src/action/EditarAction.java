package action;

import com.opensymphony.xwork2.ActionSupport;

import Informacion.Cerveza;
import Informacion.listaCervezas;

public class EditarAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombreCerveceria;
	private Cerveza cerveza;
	
	public EditarAction() {
	
	}
	
	public String execute() {
		return SUCCESS;
	}
	
	public String obtenerCerveceria() {
		listaCervezas x=new listaCervezas();
		setCerveza(x.buscarCerveza(nombreCerveceria));
		return "modificar";
	}
	
	public String eliminarCerveceria() {
		System.out.println(nombreCerveceria);
		return "modificar";
	}
	
	public String modificarCerveceria() {
		
		return SUCCESS;
	}
	
	public String getNombreCerveceria() {
		return nombreCerveceria;
	}

	public void setNombreCerveceria(String nombreCerveceria) {
		this.nombreCerveceria = nombreCerveceria;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Cerveza getCerveza() {
		return cerveza;
	}

	public void setCerveza(Cerveza cerveza) {
		this.cerveza = cerveza;
	}

}
