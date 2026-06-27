package com.example.ssh.action;

import com.example.ssh.entity.User;
import com.example.ssh.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport {
    @Resource
    private UserService userService;

    private List<User> users;

    public String list() {
        users = userService.findAll();
        return SUCCESS;
    }

    public List<User> getUsers() {
        return users;
    }
}
