package com.shrayansh.behavioural.mediatorDesignPattern.colleague;

import com.shrayansh.behavioural.mediatorDesignPattern.mediator.AuctionMediator;

public class Bidder implements Colleague {

    private String name;
    private AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        this.auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveNotification(int bidAmount) {
        System.out.println("Notification for " + name + ": Current highest bid is " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
