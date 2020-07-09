package com.deloitte.mvp.service.skill;

import com.deloitte.mvp.model.Skill;
import com.deloitte.mvp.model.User;

import java.util.List;

public interface ISkillService {

    public Skill createSkill(Skill skill);
    public List<Skill> getSkills();
    public Skill deleteSkill(long id);
    public Skill getSkillById(long id);
    public Skill getSkillByName(String skillName);
}
