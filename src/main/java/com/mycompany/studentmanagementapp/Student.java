
package com.mycompany.studentmanagementapp;

public class Student {
    private String id;
    private String name;
    private int age;
    private String email;
    private String course;

    public Student(String id, String name, int age, String email, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Student Id: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Email: " + email);
        System.out.println("Student Course: " + course);
    }
}


