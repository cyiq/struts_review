package cyiq.action;

import com.opensymphony.xwork2.Action;

public class UserAction implements Action {

	@Override
	public String execute(){
		System.out.println("user action ......");
		return "success";
	}

}
