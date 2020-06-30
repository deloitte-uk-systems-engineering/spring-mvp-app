package com.deloitte.mvp.service;

import com.deloitte.mvp.model.Engineer;
import org.springframework.stereotype.Component;

import java.util.List;


public interface IEngineerService {

    public Integer addEngineer(Engineer engineer);
    public List<Engineer> getAllEngineers();
    public boolean removeEngineer(Integer id);
    public Engineer getEngineerById(Integer id);
}
