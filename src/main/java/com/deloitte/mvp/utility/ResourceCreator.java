package com.deloitte.mvp.utility;

import com.deloitte.mvp.model.Skill;
import com.deloitte.mvp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ResourceCreator {

    /*private Map<String, User> users = new LinkedHashMap<>();
    private Map<String, Skill> skills = new LinkedHashMap<>();

    public ResourceCreator(){
        this.users = createUsers();
        this.skills = createSkills();
        addSkillsToUsers(users, skills);
    }*/

    // adding skills to users programmatically un-till move to DB based system
    /*private void addSkillsToUsers(Map<String, User> users, Map<String, Skill> skills) {
        for(Map.Entry<String, User> userEntry : users.entrySet()){
            if(userEntry.getValue().getFirstName()=="Peter"){
                userEntry.getValue().getSkills().add(getSkillByName("Java",skills));
                userEntry.getValue().getSkills().add(getSkillByName("Python",skills));
                userEntry.getValue().getSkills().add(getSkillByName("RDBMS",skills));
            }
            if(userEntry.getValue().getFirstName()=="John"){
                userEntry.getValue().getSkills().add(getSkillByName("Java",skills));
                userEntry.getValue().getSkills().add(getSkillByName("OutSystems",skills));
            }
        }
    }*/

    /*public static Map<String, User> createUsers() {

        System.out.println("!!!!!!!! create users called !!!!!!!!!!!!");

        Map<String, User> users = new LinkedHashMap<>();

        // User 1
        User userOne = new User(UUID.randomUUID().toString(), "Peter", "Hayes", "Senior Software Developer", "01-01-1990", 17.6);
        users.put(userOne.getId(), userOne);

        // User 2
        User userTwo = new User(UUID.randomUUID().toString(), "John", "Doe", "Software Developer", "01-01-1990",
                4.3, "21-01-2017");
        users.put(userTwo.getId(), userTwo);

        return users;
    }*/

    // method to fetch skill based on name to add into user to maintain id's across the app
    // will not be needed after DB implementation is done
    public static Skill getSkillByName(String name, Map<String, Skill> skills){
        List<Skill> skillList = new ArrayList<Skill>(skills.values());
        return skillList.stream().filter(s -> s.getSkill().equalsIgnoreCase(name)).
                findFirst().
                get();
    }

    /*public static Map<String, Skill> createSkills(){

        System.out.println("!!!!!!!! create Skills called !!!!!!!!!!!!");

        Map<String, Skill> skills = new LinkedHashMap<>();

        Skill java = new Skill(UUID.randomUUID().toString(), "Java", "8.12");
        Skill rest = new Skill(UUID.randomUUID().toString(), "Rest Api", "2.0");
        Skill rdbms = new Skill(UUID.randomUUID().toString(), "RDBMS", "12.0");
        Skill python = new Skill(UUID.randomUUID().toString(), "Python", "3.0");
        Skill outsystems = new Skill(UUID.randomUUID().toString(), "OutSystems", "11.0");

        skills.put(java.getId(), java);
        skills.put(rest.getId(), rest);
        skills.put(rdbms.getId(), rdbms);
        skills.put(python.getId(), python);
        skills.put(outsystems.getId(), outsystems);

        return skills;
    }*/
}