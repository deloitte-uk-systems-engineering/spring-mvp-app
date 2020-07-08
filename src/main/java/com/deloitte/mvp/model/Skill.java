package com.deloitte.mvp.model;

public class Skill {

    private String id;
    private String skill;
    private String version;

    public Skill(String id, String skill, String version) {
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

    public String getId() { return id; }

    public void setId(String skillId) { this.id = id; }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", skill='" + skill + '\'' +
                ", version=" + version +
                '}';
    }
}
