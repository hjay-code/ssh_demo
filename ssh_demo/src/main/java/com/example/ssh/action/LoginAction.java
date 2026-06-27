package com.example.ssh.action;

import com.example.ssh.entity.User;
import com.example.ssh.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Map;

@Controller("loginAction")
@Scope("prototype")
public class LoginAction extends ActionSupport implements SessionAware {
    private String username;
    private String password;
    private Map<String, Object> session;

    @Resource
    private UserService userService;

    @Override
    public String input() {
        return INPUT;
    }

    public String login() {
        User user = userService.login(username, password);
        if (user == null) {
            addActionError("用户名或密码错误");
            return INPUT;
        }
        session.put("loginUser", user);
        return SUCCESS;
    }

    public String logout() {
        session.remove("loginUser");
        return SUCCESS;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
