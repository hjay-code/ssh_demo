package com.example.ssh.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.springframework.stereotype.Component;

@Component("loginInterceptor")
public class LoginInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        Object loginUser = invocation.getInvocationContext().getSession().get("loginUser");
        if (loginUser == null) {
            return "login";
        }
        return invocation.invoke();
    }
}
