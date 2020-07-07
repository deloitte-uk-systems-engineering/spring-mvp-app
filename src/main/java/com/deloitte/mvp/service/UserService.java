package com.deloitte.mvp.service;

import com.deloitte.mvp.model.User;
import com.deloitte.mvp.utility.ResourceCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class UserService implements IUserService {

    @Autowired
    Map<Integer, User> resources;

    @Override
    public Integer createUser(User user) {
        int id = ResourceCounter.increment();
        resources.put(id, user);
        return id;
    }

    @Override
    public Map<Integer, User> getUsers() {
        return resources;
        //return new ArrayList<Engineer>(resources.values());
    }

    @Override
    public User deleteUser(Integer id) {
        if(resources.containsKey(id)) {
            User deletedUser = resources.get(id);
            resources.remove(id);
            ResourceCounter.decrement();
            return deletedUser;
        } else return null;
    }

    @Override
    public User getUserById(Integer id) {
        return resources.get(id);
    }
}
