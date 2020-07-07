package com.deloitte.mvp.controllers;

import com.deloitte.mvp.model.User;
import com.deloitte.mvp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    IUserService userService;

    // Get all users
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    // Get user by ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    // Create user
    @RequestMapping(value = "", method = RequestMethod.POST)
    public int createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    // Delete user
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public User deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }
}