package com.deloitte.mvp.utility;

import com.deloitte.mvp.model.SkilledUser;
import com.deloitte.mvp.model.User;
import com.deloitte.mvp.model.Skill;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class ResourceCreator {

    public static Map<Integer, User> createEngineers() {
        Map<Integer, User> resources = new LinkedHashMap<>();
        Map<String, Skill> skills = createSkills();

        User p1 = new User(IdCounter.incrementUserID(), "Peter", "Hayes", "Senior Software Developer", 33, 17.6);
        p1.getListOfSkills().add(new SkilledUser(p1.getUserId(), skills.get("Java"), 7));
        p1.getListOfSkills().add(new SkilledUser(p1.getUserId(), skills.get("RDBMS"), 6));
        p1.getListOfSkills().add(new SkilledUser(p1.getUserId(), skills.get("Python"), 1));
        resources.put(p1.getUserId(), p1);

        User p2 = new User(IdCounter.incrementUserID(), "John", "Doe", "Software Developer", 24,
                4.3, "21-01-2017");
        List<Skill> skillSetP2 = new ArrayList<>();
        p2.getListOfSkills().add(new SkilledUser(p2.getUserId(), skills.get("Java"), 4));
        p2.getListOfSkills().add(new SkilledUser(p2.getUserId(), skills.get("Rest Api"), 2));
        p2.getListOfSkills().add(new SkilledUser(p2.getUserId(), skills.get("OutSystems"), 2));

        resources.put(p2.getUserId(), p2);

        return resources;
    }

    public static Map<String, Skill> createSkills(){

        Map<String, Skill> skills = new LinkedHashMap<>();

        Skill javaSkill = new Skill(IdCounter.incrementSkillID(), "Java", 8.12);
        Skill restSkill = new Skill(IdCounter.incrementSkillID(), "Rest Api", 2.0);
        Skill dbmsSkill = new Skill(IdCounter.incrementSkillID(), "RDBMS", 12.0);
        Skill pythonSkill = new Skill(IdCounter.incrementSkillID(), "Python", 3.0);
        Skill outSystemsSkill = new Skill(IdCounter.incrementSkillID(), "OutSystems", 11.0);

        skills.put(javaSkill.getNameOfSkill(), javaSkill);
        skills.put(restSkill.getNameOfSkill(), restSkill);
        skills.put(dbmsSkill.getNameOfSkill(), dbmsSkill);
        skills.put(pythonSkill.getNameOfSkill(), pythonSkill);
        skills.put(outSystemsSkill.getNameOfSkill(), outSystemsSkill);

        return skills;
    }
}
