package com.shrayansh.adapterDesignPattern.Adapter;

import com.shrayansh.adapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    private final WeightMachine weightMachine;

    private static final double EXCHANGE_RATE = 0.45;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }


    @Override
    public double getWeightInKg() {
        return this.weightMachine.getWeightInPound() * EXCHANGE_RATE;
    }
}
