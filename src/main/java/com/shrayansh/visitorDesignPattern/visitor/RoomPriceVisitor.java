package com.shrayansh.visitorDesignPattern.visitor;

import com.shrayansh.visitorDesignPattern.element.DeluxeRoom;
import com.shrayansh.visitorDesignPattern.element.DoubleRoom;
import com.shrayansh.visitorDesignPattern.element.Room;
import com.shrayansh.visitorDesignPattern.element.SingleRoom;

public class RoomPriceVisitor implements Visitor{

    @Override
    public void visit(SingleRoom room) {
        System.out.println("Price of Single Room is 100$");
    }

    @Override
    public void visit(DoubleRoom room) {
        System.out.println("Price of Double Room is 200$");
    }

    @Override
    public void visit(DeluxeRoom room) {
        System.out.println("Price of Deluxe Room is 300$");
    }
}
