package action;

import java.util.ArrayList;
import Informacion.*;

import com.opensymphony.xwork2.ActionSupport;

public class CerveceriasAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Cerveza> lCervezas;
	
	public CerveceriasAction() {
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String execute(){
//		listaCervezas l=new listaCervezas();
//		l.cargarCervezas();
//		lCervezas=l.getLista();
		return SUCCESS;
	}

	public ArrayList<Cerveza> getlCervezas() {
		return lCervezas;
	}

	public void setlCervezas(ArrayList<Cerveza> lCervezas) {
		this.lCervezas = lCervezas;
	}

}
