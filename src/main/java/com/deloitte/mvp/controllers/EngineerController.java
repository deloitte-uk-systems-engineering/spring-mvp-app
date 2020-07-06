package com.deloitte.mvp.controllers;

import com.deloitte.mvp.model.Engineer;
import com.deloitte.mvp.service.IEngineerService;
import com.deloitte.mvp.utility.ResourceCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/engineer")
public class EngineerController {

    @Autowired
    IEngineerService engService;

    // Get all practioners from the map
    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
    public Map<Integer, Engineer> allPractioners(){
        return engService.getAllEngineers();
    }

    // Retrieve details of a practioner from map (Retrieve Operation)
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Engineer practionerById(@PathVariable int id){
        return engService.getEngineerById(id);
    }

    // create practitioner (Create Operation)
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public int create(@RequestBody Engineer engineer){
        return engService.addEngineer(engineer);
    }

    // remove practitioner (Delete Operation)
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public boolean create(@PathVariable int id){
        return engService.removeEngineer(id);
    }
}