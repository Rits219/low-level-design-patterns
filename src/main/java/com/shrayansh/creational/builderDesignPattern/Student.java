package com.shrayansh.creational.builderDesignPattern;

import java.util.List;

public class Student {
    private int id;
    private int rollNo;
    private String name;
    private String fatherName;
    private String motherName;
    private int age;
    private List<String> subjectList;

    public Student(StudentBuilder builder){
        this.id = builder.getId();
        this.rollNo = builder.getRollNo();
        this.name = builder.getName();
        this.motherName = builder.getMotherName();
        this.fatherName = builder.getFatherName();
        this.age = builder.getAge();
        this.subjectList = builder.getSubjectList();
    }

    public static StudentBuilder builder(){
        return new EngineerStudentBuilder();
    }
}
