package com.shrayansh.mediatorDesignPattern.colleague;

public interface Colleague {
    void placeBid(int bidAmount);
    void receiveNotification(int bidAmount);
    String getName();
}
