package com.deloitte.mvp.service;

import com.deloitte.mvp.model.Engineer;
import com.deloitte.mvp.utility.ResourceCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class EngineerService implements IEngineerService{

    @Autowired
    Map<Integer, Engineer> resources;

    @Override
    public Integer addEngineer(Engineer engineer) {
        int id = ResourceCounter.increment();
        resources.put(id, engineer);
        return id;
    }

    @Override
    public Map<Integer, Engineer> getAllEngineers() {
        return resources;
        //return new ArrayList<Engineer>(resources.values());
    }

    @Override
    public boolean removeEngineer(Integer id) {
        if(resources.containsKey(id)) {
            resources.remove(id);
            ResourceCounter.decrement();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Engineer getEngineerById(Integer id) {
        return resources.get(id);
    }
}
