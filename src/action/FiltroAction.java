package action;

import com.opensymphony.xwork2.ActionSupport;

//@Activation(value="Filtro", results={@Result(location="/WEB-INF/eventoDeportivo.jsp")})
public class FiltroAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int selectClasi;
	private int selectCerveza;
	
	public FiltroAction() {
	}
	
	public String execute() {
		return SUCCESS;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getSelectClasi() {
		return selectClasi;
	}

	public void setSelectClasi(int selectClasi) {
		this.selectClasi = selectClasi;
	}

	public int getSelectCerveza() {
		return selectCerveza;
	}

	public void setSelectCerveza(int selectCerveza) {
		this.selectCerveza = selectCerveza;
	}
	
	
}
