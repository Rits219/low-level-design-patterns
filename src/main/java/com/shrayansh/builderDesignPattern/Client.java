package com.shrayansh.builderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Decorator decorator = new Decorator(new EngineerStudentBuilder());
        Student student = decorator.createEngineerStudent();
        System.out.println(student.toString());
    }
}
