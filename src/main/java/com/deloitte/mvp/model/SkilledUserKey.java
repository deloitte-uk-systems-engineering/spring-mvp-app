package com.deloitte.mvp.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.IdClass;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Objects;

public class SkilledUserKey implements Serializable {

    private Long skill;
    private Long user;

    public Long getSkill() {
        return skill;
    }

    public void setSkill(Long skill) {
        this.skill = skill;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkilledUserKey that = (SkilledUserKey) o;
        return skill.equals(that.skill) &&
                user.equals(that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skill, user);
    }
}