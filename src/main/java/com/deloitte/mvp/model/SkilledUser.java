package com.deloitte.mvp.model;

public class SkilledUser {

    private Skill skill;
    private int userId;
    private double experience;

    public SkilledUser(int userId, Skill skill, double exp) {
        this.userId=userId;
        this.skill = skill;
        this.experience = exp;
    }

    public SkilledUser(){}

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "SkilledUser{" +
                "skill=" + skill +
                ", userId=" + userId +
                ", experience=" + experience +
                '}';
    }
}
