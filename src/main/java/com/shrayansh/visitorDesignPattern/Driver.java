package com.shrayansh.visitorDesignPattern;

import com.shrayansh.visitorDesignPattern.element.Room;
import com.shrayansh.visitorDesignPattern.element.SingleRoom;
import com.shrayansh.visitorDesignPattern.visitor.RoomMaintenanceVisitor;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Room room = new SingleRoom();
        RoomMaintenanceVisitor visitor = new RoomMaintenanceVisitor();
        room.accept(visitor);
    }
}
