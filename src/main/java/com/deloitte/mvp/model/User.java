package com.deloitte.mvp.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class User {

    private int userId;
    private String firstName;
    private String lastName;
    private String grade;
    private int age;
    private double totalExperience;
    private String dateOfJoining;
    private List<SkilledUser> skills = new ArrayList<>();

    public User(int userId, String firstName, String lastName, String grade, int age, double totalExperience, String dateOfJoining) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.age = age;
        this.totalExperience = totalExperience;
        this.dateOfJoining = dateOfJoining;
    }

    public User(int userId, String firstName, String lastName, String grade, int age, double totalExperience, String dateOfJoining, List<Skill> listOfSkills) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.age = age;
        this.totalExperience = totalExperience;
        this.dateOfJoining = dateOfJoining;
        this.skills = skills;
    }

    public User(int userId, String firstName, String lastName, String grade, int age, double totalExperience) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.age = age;
        this.totalExperience = totalExperience;
    }

    public User() {
    }

    public int getUserId() { return userId; }

    public void setUserId(int userId) { this.userId = userId; }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTotalExperience() {
        return totalExperience;
    }

    public void setTotalExperience(double totalExperience) {
        this.totalExperience = totalExperience;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public List<SkilledUser> getListOfSkills() {
        return skills;
    }

    public void setListOfSkills(List<SkilledUser> listOfSkills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade='" + grade + '\'' +
                ", age=" + age +
                ", totalExperience=" + totalExperience +
                ", dateOfJoining='" + dateOfJoining + '\'' +
                ", listOfSkills=" + skills +
                '}';
    }
}
