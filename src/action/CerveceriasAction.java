package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class CerveceriasAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> lCervezas;
	
	public CerveceriasAction() {
		lCervezas= new ArrayList<>();
		lCervezas.add("1");
		lCervezas.add("2");
		lCervezas.add("3");
		lCervezas.add("5");
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String execute(){
		lCervezas= new ArrayList<>();
		lCervezas.add("1");
		lCervezas.add("2");
		lCervezas.add("3");
		lCervezas.add("4");
//		listaCervezas l=new listaCervezas();
//		l.cargarCervezas();
//		lCervezas=l.getLista();
		return SUCCESS;
	}

	public List<String> getlCervezas() {
		return lCervezas;
	}

	public void setlCervezas(ArrayList<String> lCervezas) {
		this.lCervezas = lCervezas;
	}

}
