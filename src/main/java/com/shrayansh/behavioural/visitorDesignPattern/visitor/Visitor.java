package com.shrayansh.behavioural.visitorDesignPattern.visitor;

import com.shrayansh.visitorDesignPattern.element.DeluxeRoom;
import com.shrayansh.visitorDesignPattern.element.DoubleRoom;
import com.shrayansh.visitorDesignPattern.element.Room;
import com.shrayansh.visitorDesignPattern.element.SingleRoom;

public interface Visitor {
    public void visit(SingleRoom room);
    public void visit(DoubleRoom room);
    public void visit(DeluxeRoom room);
}
