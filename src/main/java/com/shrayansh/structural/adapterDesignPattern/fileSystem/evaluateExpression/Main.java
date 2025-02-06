package com.shrayansh.structural.adapterDesignPattern.fileSystem.evaluateExpression;

public class Main {
    public static void main(String[] args) {
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression seven = new Number(7);

        ArithmeticExpression expression = new Expression(one, seven, Operation.ADD);

        ArithmeticExpression expression1 = new Expression(two, expression, Operation.MULTIPLY);
        int result = expression1.evaluate();
        System.out.println("result is :" + result);
    }
}
