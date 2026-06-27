package com.example.ssh.init;

import com.example.ssh.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Component
public class BootstrapDataInitializer {
    @Resource
    private UserService userService;

    @PostConstruct
    public void init() {
        userService.createDefaultAdminIfNecessary();
    }
}
