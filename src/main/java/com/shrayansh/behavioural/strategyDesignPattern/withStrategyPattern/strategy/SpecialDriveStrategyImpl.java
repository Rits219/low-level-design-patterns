package com.shrayansh.behavioural.strategyDesignPattern.withStrategyPattern.strategy;

public class SpecialDriveStrategyImpl implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("special drive capability");
    }
}
