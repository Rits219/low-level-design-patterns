package com.shrayansh.behavioural.mediatorDesignPattern.mediator;

import com.shrayansh.behavioural.mediatorDesignPattern.colleague.Colleague;

public interface Mediator {
    void addBidder(Colleague bidder);
    void placeBid(Colleague bidder, int bidAmount);
}
