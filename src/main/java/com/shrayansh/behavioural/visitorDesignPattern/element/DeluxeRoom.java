package com.shrayansh.behavioural.visitorDesignPattern.element;

import com.shrayansh.visitorDesignPattern.element.Room;
import com.shrayansh.visitorDesignPattern.visitor.Visitor;

public class DeluxeRoom implements Room {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
