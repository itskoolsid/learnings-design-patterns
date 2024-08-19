package org.example.pattern.creational.factory;

import org.example.pattern.creational.factory.pizza.Pizza;
import org.example.pattern.creational.factory.pizza.PizzaSize;
import org.example.pattern.creational.factory.pizza.PizzaType;

public class Demo {
  public static void main(String[] args) {
    AbstractPizzaFactory factory = new PizzaFactory();

    Pizza pizza = factory.createPizza(PizzaType.CHEESE, PizzaSize.LARGE);
    factory.orderPizza(pizza);

    pizza = factory.createPizza(PizzaType.PEPPERONI, PizzaSize.SMALL);
    factory.orderPizza(pizza);
  }
}
