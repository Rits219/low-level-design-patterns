package com.shrayansh.behavioural.strategyDesignPattern.withStrategyPattern.Vehicle;

import com.shrayansh.behavioural.strategyDesignPattern.withStrategyPattern.strategy.NormalDriveStrategyImpl;

public class NormalDriveVehicle extends Vehicle{
    public NormalDriveVehicle() {
        super(new NormalDriveStrategyImpl());
    }
}
