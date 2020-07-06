package com.deloitte.mvp.service;

import com.deloitte.mvp.model.Engineer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


public interface IEngineerService {

    public Integer addEngineer(Engineer engineer);
    public Map<Integer, Engineer> getAllEngineers();
    public boolean removeEngineer(Integer id);
    public Engineer getEngineerById(Integer id);
}
