package org.example.pattern.creational.factory.pizza;

public class PepperoniPizza implements Pizza {
  public PepperoniPizza(final String type, final String size) {
    System.out.println(String.format("Creating: %s %s", size, type));
  }

  public void bake() {
    System.out.println("Baking Pepperoni Pizza");
  }

  public void addToppings() {
    System.out.println("Pepperoni added");
  }

  public void addSauce() {
    System.out.println("Sauce applied");
  }
}
