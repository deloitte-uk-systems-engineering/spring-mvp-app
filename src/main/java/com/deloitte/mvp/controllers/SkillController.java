package com.deloitte.mvp.controllers;

import com.deloitte.mvp.model.Skill;
import com.deloitte.mvp.model.User;
import com.deloitte.mvp.service.skill.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {

    @Autowired
    SkillService skillService;

    // Get all skills
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<Skill>> getSkills(){
        return ResponseEntity.ok().body(skillService.getSkills());
    }

    // Get skill by ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Skill> getSkillById(@PathVariable long id){
        Skill skill = skillService.getSkillById(id);
        if(skill!=null){
            return ResponseEntity.ok().body(skill);
        }
        return ResponseEntity.notFound().build();
    }

    // Create skill
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<Skill> createUser(@RequestBody Skill skill){
        return ResponseEntity.status(HttpStatus.CREATED).body(skillService.createSkill(skill));
    }

    // Get Skill by skill (name)
    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public ResponseEntity<Skill> getSkillByName(@PathVariable String name){
        Skill skill = skillService.getSkillByName(name);
        if(skill!=null){
            return ResponseEntity.status(HttpStatus.FOUND).body(skill);
        }
        return ResponseEntity.badRequest().build();
    }

    // Delete skill
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Skill> deleteSkill(@PathVariable long id){
        Skill skill = skillService.deleteSkill(id);
        if(skill == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(skill);
    }
}