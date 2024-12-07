package com.shrayansh.compositeDesignPattern.fileSystem.withCompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private String name;
    private List<FileSystem> fileSystemList;

    public Directory(String name) {
        this.name = name;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        this.fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory name: " + this.name);
        for (FileSystem fileSystem : fileSystemList) {
            fileSystem.ls();
        }
    }
}
