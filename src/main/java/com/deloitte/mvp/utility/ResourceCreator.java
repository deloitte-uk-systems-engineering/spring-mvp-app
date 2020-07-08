package com.deloitte.mvp.utility;

import com.deloitte.mvp.model.Skill;
import com.deloitte.mvp.model.User;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class ResourceCreator {

    public static Map<String, User> createUsers() {
        Map<String, User> resources = new LinkedHashMap<>();
        Map<String, Skill> skills = createSkills();

        User userOne = new User(UUID.randomUUID().toString(), "Peter", "Hayes", "Senior Software Developer", "01-01-1990", 17.6);
        userOne.getSkills().add(skills.getOrDefault("4", new Skill("2", "Rest Api", "2.0")));
        resources.put(userOne.getId(), userOne);

        User userTwo = new User(UUID.randomUUID().toString(), "John", "Doe", "Software Developer", "01-01-1990",
                4.3, "21-01-2017");
        userTwo.getSkills().add(skills.getOrDefault("1", new Skill("1", "Java", "8.12")));
        userTwo.getSkills().add(skills.getOrDefault("3", new Skill("1", "Java", "8.12")));

        resources.put(userTwo.getId(), userTwo);

        return resources;
    }

    public static Map<String, Skill> createSkills(){

        Map<String, Skill> skills = new LinkedHashMap<>();

        Skill java = new Skill("1", "Java", "8.12");
        Skill rest = new Skill("2", "Rest Api", "2.0");
        Skill rdbms = new Skill("3", "RDBMS", "12.0");
        Skill python = new Skill("4", "Python", "3.0");
        Skill outsystems = new Skill("5", "OutSystems", "11.0");

        skills.put(java.getId(), java);
        skills.put(rest.getId(), rest);
        skills.put(rdbms.getId(), rdbms);
        skills.put(python.getId(), python);
        skills.put(outsystems.getId(), outsystems);

        return skills;
    }
}
