package com.deloitte.mvp;

import com.deloitte.mvp.model.Engineer;
import com.deloitte.mvp.model.Skill;
import com.deloitte.mvp.utility.ResourceCounter;
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
    public Map<Integer, Engineer> populateRecords(){
        Map<Integer, Engineer> resources = new LinkedHashMap<>();
        Engineer p1 = new Engineer("Peter","Hays",33, 17.2);
        List<Skill> skillSetP1 = new ArrayList<>();
        skillSetP1.add(new Skill("Java", 14.6, 8.12));
        skillSetP1.add(new Skill("Rest", 16.5, 2.5));
        skillSetP1.add(new Skill("RDBMS", 17.2, 12.6));
        p1.setListOfSkills(skillSetP1);

        Engineer p2 = new Engineer("John","Doe","Business Operations - SD&E", 24,
                4.3, "21-01-2017");
        List<Skill> skillSetP2 = new ArrayList<>();
        skillSetP2.add(new Skill("Java", 4.3, 8.12));
        skillSetP2.add(new Skill("Python", 3.0, 3.0));
        skillSetP2.add(new Skill("OutSystems", 2.2, 11.0));
        p2.setListOfSkills(skillSetP2);

        resources.put(ResourceCounter.increment(),p1);
        resources.put(ResourceCounter.increment(),p2);

        return resources;
    }
}
