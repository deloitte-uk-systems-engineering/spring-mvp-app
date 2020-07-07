package com.deloitte.mvp.controllers;

import com.deloitte.mvp.model.User;
import com.deloitte.mvp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    IUserService userService;

    // Get all users
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok().body(userService.getUsers());
    }

    // Get user by ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> getUserById(@PathVariable int id){
        User user = userService.getUserById(id);
        if(user!=null){
            return ResponseEntity.ok().body(user);
        }
        return ResponseEntity.notFound().build();
    }

    // Create user
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<Integer> createUser(@RequestBody User user){
        return ResponseEntity.ok().body(userService.createUser(user));
    }

    // Delete user
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteUser(@PathVariable int id){
        User user = userService.deleteUser(id);
        if(user == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(user);
    }
}