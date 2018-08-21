package action;



import java.io.File;

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
	protected File upload;
	
	
	public EditarAction() {
		lista=new listaCervecerias();
	}
	
	public listaCervecerias getLista() {
		return lista;
	}

	public void setLista(listaCervecerias lista) {
		this.lista = lista;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
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
