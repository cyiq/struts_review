package cyiq.action;

import com.opensymphony.xwork2.Action;

public class HelloworldAction implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println("HelloWorld action ......");
		return "success";
	}

}
