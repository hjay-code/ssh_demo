package com.example.ssh.service;

import com.example.ssh.entity.User;

import java.util.List;

public interface UserService {
    User login(String username, String password);

    User findByUsername(String username);

    List<User> findAll();

    void createDefaultAdminIfNecessary();
}
