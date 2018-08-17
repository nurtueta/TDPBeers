package action;

import org.apache.struts2.components.File;

public class AgregarModificarAction extends EditarAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void validate() {
		if(cerveceria!=null) {
			if(cerveceria.getNombre().length()==0)
				addFieldError("cerveceria.nombre","Ingrese un nombre");
			if(cerveceria.getDireccion().length()==0)
				addFieldError("cerveceria.direccion","Ingrese una direccion");
			if(cerveceria.getPuntaje()>10 || cerveceria.getPuntaje()<0)
				addFieldError("cerveceria.puntaje","Ingrese un puntaje entre 0 y 10");
		}
	}

	public String modificar() {
		setCerveceria(lista.buscarCerveza(nombreCerveceria));
		return "modificar";
	}
	
	public String modificarCerveceria() {
		lista.modificarCerveceria(cerveceria);
		return "modificado";
	}
	
	public String agregarCerveceria() {
		lista.agregarCerveceria(cerveceria);
		if(archivo==null)
			System.out.println("archivo vacio");
		else
			System.out.println(archivo.getId());
		return "agregar";
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
