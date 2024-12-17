package com.shrayansh.mediatorDesignPattern;

import com.shrayansh.mediatorDesignPattern.colleague.Bidder;
import com.shrayansh.mediatorDesignPattern.colleague.Colleague;
import com.shrayansh.mediatorDesignPattern.mediator.AuctionMediator;

public class Driver {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new AuctionMediator();
        Colleague bidder1 = new Bidder("Shrayansh", auctionMediator);
        Colleague bidder2 = new Bidder("Shivansh", auctionMediator);

        bidder1.placeBid(1000);
        bidder2.placeBid(10000);
    }
}
