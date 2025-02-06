package com.shrayansh.structural.decoratorPattern.topping;

import com.shrayansh.structural.decoratorPattern.basePizza.BasePizza;

public class ExtraCheese extends ToppingDecorator {
    private BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+10;
    }
}
