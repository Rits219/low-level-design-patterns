package com.shrayansh.behavioural.visitorDesignPattern.element;

import com.shrayansh.visitorDesignPattern.element.Room;
import com.shrayansh.visitorDesignPattern.visitor.Visitor;

public class SingleRoom implements Room {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
