package cyiq.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor{

	@Override
	public void init() {
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("Action : "+invocation.getAction());
		System.out.println("Result : "+invocation.getResult());
		System.out.println("Namespace : " + invocation.getProxy().getNamespace());
		System.out.println("ActionName : " + invocation.getProxy().getActionName());
		System.out.println("Method : " + invocation.getProxy().getMethod());
		return null;
	}

	@Override
	public void destroy() {
		
	}
}
