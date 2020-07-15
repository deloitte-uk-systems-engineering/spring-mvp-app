package com.deloitte.mvp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String skill;
    private String version;
    @OneToMany(mappedBy = "skill", fetch = FetchType.EAGER)
    private Set<SkilledUser> skilledUsers = new HashSet<>();

    public Skill(long id, String skill, String version) {
        this.id = id;
        this.skill = skill;
        this.version = version;
    }

    public Skill() {
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public long getId() { return id; }

    public void setId(long skillId) { this.id = skillId; }

    public Set<SkilledUser> getSkilledUsers() {
        return skilledUsers;
    }

    public void setSkilledUsers(Set<SkilledUser> skilledUsers) {
        this.skilledUsers = skilledUsers;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", skill='" + skill + '\'' +
                ", version=" + version +
                ", skilledUsers=" + skilledUsers +
                '}';
    }
}
