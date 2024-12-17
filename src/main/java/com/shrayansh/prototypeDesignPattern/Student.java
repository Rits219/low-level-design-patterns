package com.shrayansh.prototypeDesignPattern;

public class Student implements Prototype{
    private int id;
    private String name;
    private int age;
    // many other fields

    public Student(){

    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public Student clone() {
        return new Student(this.id, this.name, this.age);
    }
}
