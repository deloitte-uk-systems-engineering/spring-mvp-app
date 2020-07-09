package com.deloitte.mvp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(SkilledUserKey.class)
public class SkilledUser implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id", referencedColumnName = "id")
    private Skill skill;

    double experience;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
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
                "user=" + user +
                ", skill=" + skill +
                ", experience=" + experience +
                '}';
    }
}
