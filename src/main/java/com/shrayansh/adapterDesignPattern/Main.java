package com.shrayansh.adapterDesignPattern;

import com.shrayansh.adapterDesignPattern.Adaptee.WeightMachineBabies;
import com.shrayansh.adapterDesignPattern.Adapter.WeightMachineAdapter;
import com.shrayansh.adapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
