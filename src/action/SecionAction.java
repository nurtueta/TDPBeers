package action;

import com.opensymphony.xwork2.ActionSupport;

public class SecionAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userpwd;
	private String userlogin;
	
	public String execute(){
		return SUCCESS;
	}
//	
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
