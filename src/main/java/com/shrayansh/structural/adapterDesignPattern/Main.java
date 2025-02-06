package com.shrayansh.structural.adapterDesignPattern;

import com.shrayansh.structural.adapterDesignPattern.Adaptee.WeightMachineBabies;
import com.shrayansh.structural.adapterDesignPattern.Adapter.WeightMachineAdapter;
import com.shrayansh.structural.adapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
