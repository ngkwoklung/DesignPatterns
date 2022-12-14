package org.sparta.jn.designpatterns.decorator.sides;

import org.sparta.jn.designpatterns.decorator.Pizza;

public class Chips extends Sides{
    public Chips(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " and chips";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 5;
    }
}
