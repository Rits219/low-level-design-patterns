package com.shrayansh.behavioural.strategyDesignPattern.withStrategyPattern.strategy;

public class NormalDriveStrategyImpl implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}
