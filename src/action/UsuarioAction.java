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
	
	public String login(){
		if(userpwd.equals("admin") && userlogin.equals("admin"))
				return SUCCESS;
		else {
			addFieldError("userlogin","El usuario o la contraseña son incorrectos");
			return ERROR;
		}
	}
	
	public void validate() {
		if(userlogin.length()<=4 || userlogin.length()>=10)
			addFieldError("userlogin","El usuario debe contener entre 4 y 10 caracteres.");
		if(userpwd.length()<=4 || userpwd.length()>=10)
			addFieldError("userpwd","La contraseña debe contener entre 4 y 10 caracteres.");
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
