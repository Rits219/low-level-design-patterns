package com.shrayansh.commandPattern.receiver;

public class Ac {
    private int temperature;
    private boolean isOn;

    public Ac() {
        this.temperature = 25;
        this.isOn = false;
    }

    public void turnOnAc() {
        this.isOn = true;
    }

    public void turnOffAc() {
        this.isOn = false;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
