package com.shrayansh.structural.flyweightDesignPattern;

public class HumanoidRobot implements IRobot {
    private String name;
    private String type;

    public HumanoidRobot(String name,String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Humanoid Robot is displayed at " + x + "," + y);
    }
}
