package org.example.pattern.creational.factory.pizza;

public enum PizzaType {
  CHEESE("Cheese"), PEPPERONI("Pepperoni");

  private final String type;

  PizzaType(String type) {
    this.type = type;
  }
}
