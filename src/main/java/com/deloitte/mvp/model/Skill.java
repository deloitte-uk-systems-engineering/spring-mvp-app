package com.deloitte.mvp.model;

public class Skill {

    private int skillId;
    private String nameOfSkill;
    private double version;

    public Skill(int skillId, String nameOfSkill, double version) {
        this.skillId = skillId;
        this.nameOfSkill = nameOfSkill;
        this.version = version;
    }

    public Skill() {
    }

    public String getNameOfSkill() {
        return nameOfSkill;
    }

    public void setNameOfSkill(String nameOfSkill) {
        this.nameOfSkill = nameOfSkill;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public int getSkillId() { return skillId; }

    public void setSkillId(int skillId) { this.skillId = skillId; }

    @Override
    public String toString() {
        return "Skill{" +
                "skillId='" + skillId + '\'' +
                ", nameOfSkill='" + nameOfSkill + '\'' +
                ", version=" + version +
                '}';
    }
}
