package com.asylzhan.spring.service;

import com.asylzhan.spring.entity.User;

import java.util.List;

public interface UserService {
    void create(User user);
    User findById(long id);
    List<User> getAllUsers();
    User findByUsername(String username);
    User update(User user);
    void delete(int id);
}
