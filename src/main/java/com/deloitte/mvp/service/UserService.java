package com.deloitte.mvp.service;

import com.deloitte.mvp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Component
public class UserService implements IUserService {

    @Autowired
    Map<String, User> resources;

    @Override
    public User createUser(User user) {
        String id = UUID.randomUUID().toString();
        user.setId(id);
        resources.put(id, user);
        return user;
    }

    @Override
    public List<User> getUsers() {
        return new ArrayList<User>(resources.values());
    }

    @Override
    public User deleteUser(String id) {
        if(resources.containsKey(id)) {
            User deletedUser = resources.get(id);
            resources.remove(id);
            return deletedUser;
        } else return null;
    }

    @Override
    public User getUserById(String id) {
        return resources.get(id);
    }
}
