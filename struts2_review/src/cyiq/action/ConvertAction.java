package cyiq.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class ConvertAction extends ActionSupport {
	public String username;
	public Integer age;
	public Date birthday;
	

	public void setUsername(String username) {
		this.username = username;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String convert(){
		System.out.println("convert......");
		System.out.println(username+"....");
		System.out.println(age+"....");
		System.out.println(birthday+"....");
		return "aaa";
	}
}
