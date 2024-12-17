package com.shrayansh.mediatorDesignPattern.mediator;

import com.shrayansh.mediatorDesignPattern.colleague.Colleague;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator {
    private List<Colleague> bidders;

    public AuctionMediator() {
        this.bidders = new ArrayList<>();
    }

    @Override
    public void addBidder(Colleague bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for(Colleague colleague:bidders){
            if(!colleague.getName().equals(bidder.getName())){
                colleague.receiveNotification(bidAmount);
            }
        }
    }
}
