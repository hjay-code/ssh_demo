package com.example.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("dashboardAction")
@Scope("prototype")
public class DashboardAction extends ActionSupport {
    public String index() {
        return SUCCESS;
    }
}
