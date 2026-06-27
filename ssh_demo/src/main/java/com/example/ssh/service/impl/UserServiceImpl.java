package com.example.ssh.service.impl;

import com.example.ssh.dao.UserDao;
import com.example.ssh.entity.User;
import com.example.ssh.service.UserService;
import com.example.ssh.util.Md5Util;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public User login(String username, String password) {
        User user = userDao.findByUsername(username);
        if (user == null || user.getStatus() == null || user.getStatus() != 1) {
            return null;
        }
        return Md5Util.md5(password).equals(user.getPassword()) ? user : null;
    }

    @Override
    @Transactional(readOnly = true)
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void createDefaultAdminIfNecessary() {
        if (userDao.findByUsername("admin") != null) {
            return;
        }
        User admin = new User();
        admin.setUsername("admin");
        admin.setPassword(Md5Util.md5("123456"));
        admin.setRealName("System Administrator");
        admin.setEmail("admin@example.com");
        admin.setStatus(1);
        admin.setCreateTime(LocalDateTime.now());
        userDao.save(admin);
    }
}
