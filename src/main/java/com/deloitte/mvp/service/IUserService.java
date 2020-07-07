package com.deloitte.mvp.service;

import com.deloitte.mvp.model.User;

import java.util.Map;


public interface IUserService {

    public Integer createUser(User user);
    public Map<Integer, User> getUsers();
    public User deleteUser(Integer id);
    public User getUserById(Integer id);
}
