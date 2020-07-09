package com.deloitte.mvp.service.skill;

import com.deloitte.mvp.model.Skill;
import com.deloitte.mvp.model.User;
import com.deloitte.mvp.repository.SkillRepo;
import com.deloitte.mvp.utility.ResourceCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SkillService implements ISkillService {

    @Autowired
    SkillRepo skillRepo;

    @Override
    public List<Skill> getSkills() {
        return skillRepo.findAll();
    }

    @Override
    public Skill getSkillById(long id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public Skill getSkillByName(String skillName) {
        return skillRepo.findBySkill(skillName);
    }

    @Override
    public Skill createSkill(Skill skill) {
        return skillRepo.save(skill);
    }

    @Override
    public Skill deleteSkill(long id) {
        Skill deletedSkill = skillRepo.findById(id).orElse(null);
        if (deletedSkill != null) {
            skillRepo.deleteById(id);
        }
        return deletedSkill;
    }
}