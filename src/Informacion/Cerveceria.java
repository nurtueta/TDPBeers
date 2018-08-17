package Informacion;

import org.apache.struts2.components.File;

/**
 * Clase encargada de representar la cerveceria
 * @author Urtueta, Nahuel
 * @author Volpe, Leandro
 *
 */
public class Cerveceria extends Local {
	
	private String mejorVariedad;

	public Cerveceria() {
	}

	public String getMejorVariedad() {
		return mejorVariedad;
	}

	public void setMejorVariedad(String mejorVariedad) {
		this.mejorVariedad = mejorVariedad;
	}
	
}
