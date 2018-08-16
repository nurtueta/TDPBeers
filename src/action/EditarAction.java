package action;

import org.apache.struts2.components.File;

import com.opensymphony.xwork2.ActionSupport;

import Informacion.Cerveceria;
import Informacion.listaCervecerias;

/**
 * Clase encargada del manejo de las acciones
 * @author Urtueta, Nahuel
 * @author Volpe, Leandro
 *
 */
public abstract class EditarAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	protected String nombreCerveceria;
	protected Cerveceria cerveceria;
	protected listaCervecerias lista;
	protected File archivo;
	
	
	public EditarAction() {
		lista=new listaCervecerias();
	}
	
	public abstract void validate();
	
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
