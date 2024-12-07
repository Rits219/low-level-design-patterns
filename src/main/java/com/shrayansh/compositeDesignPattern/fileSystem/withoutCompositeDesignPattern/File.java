package com.shrayansh.compositeDesignPattern.fileSystem.withoutCompositeDesignPattern;

public class File {
    String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println("file name: " + this.name);
    }
}
