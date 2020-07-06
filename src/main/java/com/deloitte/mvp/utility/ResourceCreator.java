package com.deloitte.mvp.utility;

import com.deloitte.mvp.model.Engineer;
import com.deloitte.mvp.model.Skill;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class ResourceCreator {

    public static Map<Integer, Engineer> createEngineers(){
        {
            Map<Integer, Engineer> resources = new LinkedHashMap<>();
            Engineer p1 = new Engineer("Peter", "Hayes", "Senior Software Developer", 33, 17.6);
            List<Skill> skillSetP1 = new ArrayList<>();
            skillSetP1.add(new Skill("Java", 14.6, 8.12));
            skillSetP1.add(new Skill("Rest", 16.5, 2.5));
            skillSetP1.add(new Skill("RDBMS", 17.2, 12.6));
            p1.setListOfSkills(skillSetP1);

            Engineer p2 = new Engineer("John","Doe","Software Developer", 24,
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
}
