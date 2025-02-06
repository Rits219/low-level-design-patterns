package com.shrayansh.behavioural.visitorDesignPattern.visitor;

import com.shrayansh.visitorDesignPattern.element.DeluxeRoom;
import com.shrayansh.visitorDesignPattern.element.DoubleRoom;
import com.shrayansh.visitorDesignPattern.element.SingleRoom;
import com.shrayansh.visitorDesignPattern.visitor.Visitor;

public class RoomMaintenanceVisitor implements Visitor {
    @Override
    public void visit(SingleRoom room) {
        System.out.println("Room Maintenance Visitor visited Single Room");
    }

    @Override
    public void visit(DoubleRoom room) {
        System.out.println("Room Maintenance Visitor visited Double Room"
        );
    }

    @Override
    public void visit(DeluxeRoom room) {
        System.out.println("Room Maintenance Visitor visited Deluxe Room");
    }
}
