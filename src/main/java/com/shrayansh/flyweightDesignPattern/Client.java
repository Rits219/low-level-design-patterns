package com.shrayansh.flyweightDesignPattern;

public class Client {
    public static void main(String[] args) {
        RoboticFactory factory = new RoboticFactory();
        IRobot robot = factory.getRobotFromFactory(RoboticType.DOG);
        robot.display(10, 20);

        IRobot robot1 = factory.getRobotFromFactory(RoboticType.DOG);
        robot1.display(30, 40);
    }
}
