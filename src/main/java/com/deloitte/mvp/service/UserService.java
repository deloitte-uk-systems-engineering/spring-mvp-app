package com.deloitte.mvp.service;

import com.deloitte.mvp.model.User;
import com.deloitte.mvp.utility.IdCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class UserService implements IUserService {

    @Autowired
    Map<Integer, User> resources;

    @Override
    public User createUser(User user) {
        int id = IdCounter.incrementUserID();
        resources.put(id, user);
        return user;
    }

    @Override
    public List<User> getUsers() {
        return new ArrayList<User>(resources.values());
    }

    @Override
    public User deleteUser(Integer id) {
        if(resources.containsKey(id)) {
            User deletedUser = resources.get(id);
            resources.remove(id);
            IdCounter.decrementUserID();
            return deletedUser;
        } else return null;
    }

    @Override
    public User getUserById(Integer id) {
        return resources.get(id);
    }
}
