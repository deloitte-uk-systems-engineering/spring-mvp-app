package com.deloitte.mvp.controllers;

import com.deloitte.mvp.model.Engineer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/engineer")
public class EngineerController {

    @Autowired
    protected Map<Integer,Engineer> resources;

    // Get all practioners from the map
    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
    public Map<Integer, Engineer> allPractioners(){
        return resources;
    }

    // Retrieve details of a practioner from map
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Engineer practionerById(@PathVariable int id){
        return resources.get(id);
    }
}
