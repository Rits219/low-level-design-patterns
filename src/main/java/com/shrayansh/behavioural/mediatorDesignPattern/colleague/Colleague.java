package com.shrayansh.behavioural.mediatorDesignPattern.colleague;

public interface Colleague {
    void placeBid(int bidAmount);
    void receiveNotification(int bidAmount);
    String getName();
}
