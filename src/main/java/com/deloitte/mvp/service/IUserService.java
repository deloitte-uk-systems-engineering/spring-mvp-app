package com.deloitte.mvp.service;

import com.deloitte.mvp.model.User;

import java.util.List;


public interface IUserService {

    public User createUser(User user);
    public List<User> getUsers();
    public User deleteUser(String id);
    public User getUserById(String id);
}
