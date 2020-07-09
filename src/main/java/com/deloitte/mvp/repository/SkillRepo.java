package com.deloitte.mvp.repository;

import com.deloitte.mvp.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepo extends JpaRepository<Skill, Long> {

    public Skill findBySkill(String skill);
}
