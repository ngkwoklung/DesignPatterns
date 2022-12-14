package org.sparta.jn.designpatterns.decorator;

import org.sparta.jn.designpatterns.decorator.sides.Chips;
import org.sparta.jn.designpatterns.decorator.sides.Salad;

public class App {
    public static void main(String[] args) {
        Italian italian = new Italian();
        System.out.println(italian.getDescription() + " Cost: " + italian.getCost());

        Salad salad = new Salad(italian);
        System.out.println(salad.getDescription() + " Cost: " + salad.getCost());

        Chips chips = new Chips(italian);
        System.out.println(chips.getDescription() + " Cost: " + chips.getCost());


    }
}
