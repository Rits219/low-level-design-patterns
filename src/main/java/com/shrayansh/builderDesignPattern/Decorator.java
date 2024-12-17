package com.shrayansh.builderDesignPattern;

public class Decorator {
    private StudentBuilder studentBuilder;

    public Decorator(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createEngineerStudent() {
        return Student.builder()
                .setId(1)
                .setAge(20)
                .setFatherName("Balakrishna")
                .setMotherName("Kailash")
                .setName("Ritesh")
                .setSubjectList()
                .build();
    }
}
