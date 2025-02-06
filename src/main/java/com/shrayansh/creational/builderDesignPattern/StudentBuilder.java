package com.shrayansh.creational.builderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {
    public int getId() {
        return id;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSubjectList() {
        return subjectList;
    }

    private int id;
    private int rollNo;
    private String name;
    private String fatherName;
    private String motherName;
    private int age;
    protected List<String> subjectList;

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public abstract StudentBuilder setSubjectList();

    public Student build(){
        return new Student(this);
    }
}
