package com.shrayansh.mediatorDesignPattern.mediator;

import com.shrayansh.mediatorDesignPattern.colleague.Colleague;

public interface Mediator {
    void addBidder(Colleague bidder);
    void placeBid(Colleague bidder, int bidAmount);
}
