package action;

import com.opensymphony.xwork2.ActionSupport;

import Informacion.Cerveceria;
import Informacion.listaCervezas;

public class EditarAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombreCerveceria;
	private Cerveceria cerveceria;
	
	public EditarAction() {
	
	}
	
	public String execute() {
		return SUCCESS;
	}
	
	public String obtenerCerveceria() {
		listaCervezas x=new listaCervezas();
		setCerveceria(x.buscarCerveza(nombreCerveceria));
		return "modificar";
	}
	
	//ver como modificar esto para que no tenga que llamara obtener cerveceria adetro del eliminar
	public String eliminarCerveceria() {
		obtenerCerveceria();
		listaCervezas x=new listaCervezas();
		x.eliminarCerveceria(cerveceria);
		return "eliminar";
	}
	
	public String modificarCerveceria() {
		listaCervezas x=new listaCervezas();
		x.modificarCerveceria(cerveceria);
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

	public Cerveceria getCerveceria() {
		return cerveceria;
	}

	public void setCerveceria(Cerveceria cerveza) {
		this.cerveceria = cerveza;
	}

}
