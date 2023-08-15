package com.emiyaconsulting.student_records;

// A simple POJO class / entity to model student data (also called a "bean" or "Java bean")
public class Student {
    private String id;
    private String lastName;
    private String firstName;
    private String dateOfBirth;
    private String classLevel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(String classLevel) {
        this.classLevel = classLevel;
    }

    public Student(String id, String lastName, String firstName, String dateOfBirth, String classLevel) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.classLevel = classLevel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classLevel='" + classLevel + '\'' +
                '}';
    }
}
