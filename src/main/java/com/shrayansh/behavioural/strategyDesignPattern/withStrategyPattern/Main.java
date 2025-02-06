package com.shrayansh.behavioural.strategyDesignPattern.withStrategyPattern;

import com.shrayansh.behavioural.strategyDesignPattern.withStrategyPattern.Vehicle.NormalDriveVehicle;

public class Main {
    public static void main(String[] args) {
//        SportsVehicle sportsVehicle = new SportsVehicle();
//        sportsVehicle.drive();

        NormalDriveVehicle normalDriveVehicle = new NormalDriveVehicle();
        normalDriveVehicle.drive();
    }
}
