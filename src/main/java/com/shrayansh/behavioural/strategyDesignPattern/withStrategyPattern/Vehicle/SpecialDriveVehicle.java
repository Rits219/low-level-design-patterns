package com.shrayansh.behavioural.strategyDesignPattern.withStrategyPattern.Vehicle;


import com.shrayansh.behavioural.strategyDesignPattern.withStrategyPattern.strategy.SpecialDriveStrategyImpl;

public class SpecialDriveVehicle extends Vehicle {
    public SpecialDriveVehicle() {
        super(new SpecialDriveStrategyImpl());
    }
}
