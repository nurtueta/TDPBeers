package action;

import com.opensymphony.xwork2.ActionSupport;

import Informacion.Cerveceria;
import Informacion.listaCervecerias;

public class EditarAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombreCerveceria;
	private Cerveceria cerveceria;
	private listaCervecerias lista;
	
	public EditarAction() {
		lista=new listaCervecerias();
	}
	
	public String execute() {
		return SUCCESS;
	}
	
	public String obtenerCerveceria() {
		setCerveceria(lista.buscarCerveza(nombreCerveceria));
		return "modificar";
	}
	
	//ver como modificar esto para que no tenga que llamara obtener cerveceria adetro del eliminar
	public String eliminarCerveceria() {
		setCerveceria(lista.buscarCerveza(nombreCerveceria));
		lista.eliminarCerveceria(cerveceria);
		return "eliminar";
	}
	
	public String modificarCerveceria() {
		lista.modificarCerveceria(cerveceria);
		return SUCCESS;
	}
	
	public String agregarCerveceria() {
		lista.agregarCerveceria(cerveceria);
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
