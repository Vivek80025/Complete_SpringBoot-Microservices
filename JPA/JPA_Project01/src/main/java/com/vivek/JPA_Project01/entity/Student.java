package com.vivek.JPA_Project01.entity;

import jakarta.persistence.*;

@Entity // used to link my class to table
@Table(name = "students")  // name of table-->table ka name kya rakhna hai
public class Student {

    @Id  //make primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //id automatically generate ho jyega and 1 bdhta jyega

    //@Column(name = "student-id")-->if we want another name of column ,but program me id hi use kro-->alice
    private int id;     //column of table
    private String name;
    private  String email;
    private int age;

    public Student() {

    }

    public Student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
