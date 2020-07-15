package com.deloitte.mvp.service.user;

import com.deloitte.mvp.model.User;

import java.util.List;


public interface IUserService {

    public User createUser(User user);
    public List<User> getUsers();
    public User deleteUser(long id);
    public User getUserById(long id);
    public User updateUser(User user);
}
