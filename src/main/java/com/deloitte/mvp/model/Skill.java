package com.deloitte.mvp.model;

public class Skill {

    private String nameOfSkill;
    private double experience;
    private double version;

    public Skill(String nameOfSkill, double experience, double version) {
        this.nameOfSkill = nameOfSkill;
        this.experience = experience;
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

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "nameOfSkill='" + nameOfSkill + '\'' +
                ", experience=" + experience +
                ", version=" + version +
                '}';
    }
}
