package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class CerveceriasAction extends ActionSupport{
	private List<String> listaCervesas;

	public List<String> getListaCervesas() {
		return listaCervesas;
	}

	public void setListaCervesas(List<String> listaCervesas) {
		this.listaCervesas = listaCervesas;
	}

}
