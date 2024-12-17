package com.shrayansh.flyweightDesignPattern;

public class DogRobot implements IRobot {
    private String name;
    private String type;

    public DogRobot(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Dog Robot is displayed at " + x + "," + y);
    }
}
