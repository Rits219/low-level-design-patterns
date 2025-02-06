package com.shrayansh.structural.adapterDesignPattern.fileSystem.withoutCompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String name;
    List<Object> objectList;

    public Directory(String name) {
        this.name = name;
        this.objectList = new ArrayList<>();
    }

    public void add(Object obj) {
        this.objectList.add(obj);
    }

    public void ls() {
        System.out.println("Directory name: " + this.name);
        for (Object object : objectList) {
            if (object instanceof Directory) {
                ((Directory) object).ls();
            } else if (object instanceof File) {
                ((File) object).ls();
            } else {
                System.out.println("not supported operation");
            }
        }
    }
}
