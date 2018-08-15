package action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * Clase encargada del manejo de las acciones del usuario
 * @author Urtueta, Nahuel
 * @author Volpe, Leandro
 *
 */
public class UsuarioAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private String userpwd;
	private String userlogin;
	
	public String execute(){
		if(userpwd.equals("admin"))
			if(userlogin.equals("admin"))
				return SUCCESS;
		return SUCCESS;
	}

	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getUserlogin() {
		return userlogin;
	}
	public void setUserlogin(String userlogin) {
		this.userlogin = userlogin;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
