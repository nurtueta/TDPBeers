package actions;

import java.util.ArrayList;
import java.util.List;

import javax.resource.spi.Activation;

import com.opensymphony.xwork2.ActionSupport;


@Activation(value="Filtro", results={@Result(location="/WEB-INF/eventoDeportivo.jsp")})
public class Filtro extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> listPuntuacion;
	private String selectPuntuacion;
	
	public Filtro() {
		selectPuntuacion="pepe";
		listPuntuacion=new ArrayList<>();
		listPuntuacion.add("mayor");
		listPuntuacion.add("Menor");
	}
	
	public String execute() {
		selectPuntuacion="pepe";
		listPuntuacion=new ArrayList<>();
		listPuntuacion.add("mayor");
		listPuntuacion.add("Menor");
		return SUCCESS;
	}
	
	public String getDefault() {
		return "xx";
	}
	
	public List<String> getListPuntuacion() {
		return listPuntuacion;
	}
	
	public void setListPuntuacion(List<String> listPuntuacion) {
		this.listPuntuacion = listPuntuacion;
	}
	public String getSelectPuntuacion() {
		return selectPuntuacion;
	}
	public void setSelectPuntuacion(String selectPuntuacion) {
		this.selectPuntuacion = selectPuntuacion;
	}
	
	public String display() {
		return NONE;
	}

}
