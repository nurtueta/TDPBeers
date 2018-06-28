package interceptors;
import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor {
	private static final long serialVersionUID = 1L;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		//System.out.println("Destroy");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		//System.out.println("Init");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//System.out.println("Intercept");
		Map<String, Object> sessionAttributes = invocation.getInvocationContext().getSession();

		if (sessionAttributes == null || sessionAttributes.get("loginId") == null) {
			return "login";
		} else {
			if (!((String) sessionAttributes.get("loginId")).equals(null)) {
				return invocation.invoke();
			} else {
				return "login";
			}
		}

	}

}
