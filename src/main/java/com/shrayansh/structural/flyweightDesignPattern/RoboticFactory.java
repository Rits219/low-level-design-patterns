package com.shrayansh.structural.flyweightDesignPattern;

import java.util.concurrent.ConcurrentHashMap;

public class RoboticFactory {
    ConcurrentHashMap<String, IRobot> cache = new ConcurrentHashMap<>();
    public IRobot getRobotFromFactory(RoboticType type) {

        if (type.equals(RoboticType.HUMAN)) {
            return cache.computeIfAbsent("Humanoid", k -> new HumanoidRobot("Humanoid", type.name()));
        } else {
            return cache.computeIfAbsent("Robotic", k -> new DogRobot("Dog", type.name()));
        }
    }
}
