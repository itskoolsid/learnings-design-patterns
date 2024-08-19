package org.example.pattern.creational.factory;

import org.example.pattern.creational.factory.pizza.CheesePizza;
import org.example.pattern.creational.factory.pizza.PepperoniPizza;
import org.example.pattern.creational.factory.pizza.Pizza;
import org.example.pattern.creational.factory.pizza.PizzaSize;
import org.example.pattern.creational.factory.pizza.PizzaType;

public class PizzaFactory extends AbstractPizzaFactory{

  @Override
  public Pizza createPizza(PizzaType pizzaType, PizzaSize pizzaSize) {
    switch (pizzaType) {
      case PizzaType.CHEESE -> {
        return new CheesePizza(pizzaType.toString(), pizzaSize.toString());
      }
      case PizzaType.PEPPERONI -> {
        return new PepperoniPizza(pizzaType.toString(), pizzaSize.toString());
      }
      default -> throw new IllegalStateException("Unexpected value: " + pizzaType);
    }
  }
}
