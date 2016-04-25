package cyiq.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.Action;

import cyiq.action.UserAction;


public class Struts2Filter implements Filter{
	Map<String,String> map = new HashMap<String, String>();
	@Override
	public void init(FilterConfig config) throws ServletException {
		map.put("/primer/userAction.action", "cyiq.action.UserAction");
		map.put("/helloworld/helloworld.action", "cyiq.action.HelloworldAction");
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String path = req.getServletPath();
		if(path.equals("/test1.jsp")){
			chain.doFilter(req, resp);
		}else{
			try {
				Action Action = (com.opensymphony.xwork2.Action) Class.forName(map.get(path)).newInstance();
				Action.execute();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			req.getRequestDispatcher("/success.jsp").forward(req, resp);
		}
		
	}

	@Override
	public void destroy() {
		
	}

}
