package com.deloitte.mvp.model;

import java.util.List;

public class Practioner {

    private String firstName;
    private String lastName;
    private String unit;
    private int age;
    private double totalExperience;
    private String dateOfJoining;
    private List<Skill> listOfSkills;

    public Practioner(String firstName, String lastName, String unit, int age, double totalExperience, String dateOfJoining) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.unit = unit;
        this.age = age;
        this.totalExperience = totalExperience;
        this.dateOfJoining = dateOfJoining;
    }

    public Practioner(String firstName, String lastName, String unit, int age, double totalExperience, String dateOfJoining, List<Skill> listOfSkills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.unit = unit;
        this.age = age;
        this.totalExperience = totalExperience;
        this.dateOfJoining = dateOfJoining;
        this.listOfSkills = listOfSkills;
    }

    public Practioner(String firstName, String lastName, int age, double totalExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.totalExperience = totalExperience;
    }

    public Practioner() {
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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
        return "Practioner{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", unit='" + unit + '\'' +
                ", age=" + age +
                ", totalExperience=" + totalExperience +
                ", dateOfJoining='" + dateOfJoining + '\'' +
                ", listOfSkills=" + listOfSkills +
                '}';
    }
}
