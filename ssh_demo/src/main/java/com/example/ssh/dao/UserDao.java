package com.example.ssh.dao;

import com.example.ssh.entity.User;

import java.util.List;

public interface UserDao {
    User findByUsername(String username);

    List<User> findAll();

    void save(User user);
}
