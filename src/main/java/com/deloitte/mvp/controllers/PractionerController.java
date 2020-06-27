package com.deloitte.mvp.controllers;

import com.deloitte.mvp.model.Practioner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/practioner")
public class PractionerController {

    @Autowired
    protected Map<Integer,Practioner> resources;

    // Get all practioners from the map
    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
    public Map<Integer, Practioner> allPractioners(){
        return resources;
    }

    // Retrieve details of a practioner from map
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Practioner practionerById(@PathVariable int id){
        return resources.get(id);
    }
}
