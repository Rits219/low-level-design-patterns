package com.shrayansh.builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjectList() {
        List<String> subjectList = new ArrayList<>();
        subjectList.add("MBA");
        this.subjectList = subjectList;
        return this;
    }
}
