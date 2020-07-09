package com.deloitte.mvp;

import com.deloitte.mvp.model.Skill;
import com.deloitte.mvp.model.User;
import com.deloitte.mvp.utility.ResourceCreator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Map;

@SpringBootApplication
public class SpringMvpAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringMvpAppApplication.class, args);
    }
}