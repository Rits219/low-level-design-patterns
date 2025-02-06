package com.shrayansh.structural.adapterDesignPattern.fileSystem.withoutCompositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        File bahubali = new File("bahubali");
        File kanchana = new File("Kanchana");

        Directory directory = new Directory("directory");
        Directory subDirectory = new Directory("subDirectory");

        directory.add(subDirectory);
        directory.add(bahubali);
        subDirectory.add(kanchana);

        directory.ls();
    }
}
