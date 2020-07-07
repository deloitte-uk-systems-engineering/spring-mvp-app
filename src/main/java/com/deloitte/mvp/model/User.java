package com.deloitte.mvp.model;

import java.util.List;

public class User {

    private String firstName;
    private String lastName;
    private String grade;
    private int age;
    private double totalExperience;
    private String dateOfJoining;
    private List<Skill> listOfSkills;

    public User(String firstName, String lastName, String grade, int age, double totalExperience, String dateOfJoining) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.age = age;
        this.totalExperience = totalExperience;
        this.dateOfJoining = dateOfJoining;
    }

    public User(String firstName, String lastName, String grade, int age, double totalExperience, String dateOfJoining, List<Skill> listOfSkills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.age = age;
        this.totalExperience = totalExperience;
        this.dateOfJoining = dateOfJoining;
        this.listOfSkills = listOfSkills;
    }

    public User(String firstName, String lastName, String grade, int age, double totalExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.age = age;
        this.totalExperience = totalExperience;
    }

    public User() {
    }

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

    public List<Skill> getListOfSkills() {
        return listOfSkills;
    }

    public void setListOfSkills(List<Skill> listOfSkills) {
        this.listOfSkills = listOfSkills;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade='" + grade + '\'' +
                ", age=" + age +
                ", totalExperience=" + totalExperience +
                ", dateOfJoining='" + dateOfJoining + '\'' +
                ", listOfSkills=" + listOfSkills +
                '}';
    }
}
