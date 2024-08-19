package org.example.pattern.creational.factory;

import org.example.pattern.creational.factory.pizza.Pizza;
import org.example.pattern.creational.factory.pizza.PizzaSize;
import org.example.pattern.creational.factory.pizza.PizzaType;

public abstract class AbstractPizzaFactory {

  public void orderPizza(final Pizza pizza) {
    pizza.addSauce();
    pizza.addToppings();
    pizza.bake();
    System.out.println("Done!");
  }

  public abstract Pizza createPizza(final PizzaType pizzaType, final PizzaSize pizzaSize);
}
