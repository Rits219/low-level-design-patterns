package com.shrayansh.structural.decoratorPattern;

import com.shrayansh.structural.decoratorPattern.basePizza.BasePizza;
import com.shrayansh.structural.decoratorPattern.basePizza.VegDelight;
import com.shrayansh.structural.decoratorPattern.topping.ExtraCheese;
import com.shrayansh.structural.decoratorPattern.topping.Mushroom;

public class PizzaStore {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new Mushroom(new ExtraCheese(new VegDelight())));
        System.out.println(pizza.cost());
    }
}
