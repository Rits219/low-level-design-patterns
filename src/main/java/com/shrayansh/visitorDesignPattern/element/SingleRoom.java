package com.shrayansh.visitorDesignPattern.element;

import com.shrayansh.visitorDesignPattern.visitor.Visitor;

public class SingleRoom implements Room{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
