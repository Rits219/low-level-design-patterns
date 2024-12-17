package com.shrayansh.prototypeDesignPattern;


public class Client {
    public static void main(String[] args) {
        Student student = new Student(1, "Shrayansh", 21);
        Student cloneStudent = student.clone();
    }
}
