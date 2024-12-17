package com.shrayansh.builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineerStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjectList() {
        List<String> subjectList = new ArrayList<>();
        subjectList.add("CS");
        subjectList.add("DSA");
        subjectList.add("TOC");
        this.subjectList = subjectList;
        return this;
    }
}
