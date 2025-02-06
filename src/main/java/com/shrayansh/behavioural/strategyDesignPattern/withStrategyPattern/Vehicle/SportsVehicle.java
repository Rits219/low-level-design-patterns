package com.shrayansh.behavioural.strategyDesignPattern.withStrategyPattern.Vehicle;


import com.shrayansh.behavioural.strategyDesignPattern.withStrategyPattern.strategy.SpecialDriveStrategyImpl;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SpecialDriveStrategyImpl());
    }
}