package action;

import com.opensymphony.xwork2.ActionSupport;

public class EditarAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombreCerveceria;
	
	public EditarAction() {
	
	}
	
	public String execute() {
		return SUCCESS;
	}
	
	public String modificarCerveceria() {
		System.out.println(nombreCerveceria);
		return "modificar";
	}
	
	public String eliminarCerveceria() {
		System.out.println(nombreCerveceria);
		return "modificar";
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

}
