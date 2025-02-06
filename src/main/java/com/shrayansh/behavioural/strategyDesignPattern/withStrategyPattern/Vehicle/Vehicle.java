package com.shrayansh.behavioural.strategyDesignPattern.withStrategyPattern.Vehicle;

import com.shrayansh.behavioural.strategyDesignPattern.withStrategyPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObj;

    //this is known as constructor injection
    public Vehicle(DriveStrategy driveObj) {
        this.driveObj = driveObj;
    }

    public void drive() {
        driveObj.drive();
    }
}
