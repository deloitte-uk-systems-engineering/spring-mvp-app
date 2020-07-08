package com.deloitte.mvp.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class User {

    private String id;
    private String firstName;
    private String lastName;
    private String grade;
    private String dateOfBirth;
    private double yearsExperience;
    private String dateJoined;
    private List<Skill> skills = new ArrayList<>();

    public User(String id, String firstName, String lastName, String grade, String dateOfBirth, double yearsExperience, String dateJoined) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.dateOfBirth = dateOfBirth;
        this.yearsExperience = yearsExperience;
        this.dateJoined = dateJoined;
    }

    public User(String id, String firstName, String lastName, String grade, String dateOfBirth, double yearsExperience, String dateJoined, List<Skill> skills) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.dateOfBirth = dateOfBirth;
        this.yearsExperience = yearsExperience;
        this.dateJoined = dateJoined;
        this.skills = skills;
    }

    public User(String id, String firstName, String lastName, String grade, String dateOfBirth, double yearsExperience) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.dateOfBirth = dateOfBirth;
        this.yearsExperience = yearsExperience;
    }

    public User() {
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(double yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public String getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
    }

    public List<Skill> getSkills () {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade='" + grade + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", yearsExperience=" + yearsExperience +
                ", dateJoined='" + dateJoined + '\'' +
                ", skills=" + skills +
                '}';
    }
}
