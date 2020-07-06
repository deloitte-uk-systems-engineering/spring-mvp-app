package com.deloitte.mvp;

import com.deloitte.mvp.model.Engineer;
import com.deloitte.mvp.model.Skill;
import com.deloitte.mvp.utility.ResourceCounter;
import com.deloitte.mvp.utility.ResourceCreator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class SpringMvpAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvpAppApplication.class, args);

    }

    @Bean
    public Map<Integer, Engineer> initialize(){
        return ResourceCreator.createEngineers();
    }
}
