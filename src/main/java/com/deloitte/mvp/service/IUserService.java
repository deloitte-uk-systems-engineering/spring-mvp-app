package com.deloitte.mvp.service;

import com.deloitte.mvp.model.User;

import java.util.List;
import java.util.Map;


public interface IUserService {

    public Integer createUser(User user);
    public List<User> getUsers();
    public User deleteUser(Integer id);
    public User getUserById(Integer id);
}
