package com.shrayansh.behavioural.visitorDesignPattern.element;

import com.shrayansh.visitorDesignPattern.visitor.Visitor;

public interface Room {
    void accept(Visitor visitor);
}
