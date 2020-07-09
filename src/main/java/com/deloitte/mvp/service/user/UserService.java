package com.deloitte.mvp.service.user;

import com.deloitte.mvp.model.Skill;
import com.deloitte.mvp.model.User;
import com.deloitte.mvp.repository.SkillRepo;
import com.deloitte.mvp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService implements IUserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User deleteUser(long id) {
        User deletedUser = userRepo.findById(id).orElse(null);
        if (deletedUser != null) {
            userRepo.deleteById(id);
        }
        return deletedUser;
    }
}