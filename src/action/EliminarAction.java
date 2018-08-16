package action;

public class EliminarAction extends EditarAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void validate() {
		
	}

	public String eliminarCerveceria() {
		setCerveceria(lista.buscarCerveza(nombreCerveceria));
		lista.eliminarCerveceria(cerveceria);
		return "eliminar";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

