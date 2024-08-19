package org.example.pattern.creational.factory.pizza;

public class CheesePizza implements Pizza {

  public CheesePizza(final String type, final String size) {
    System.out.println(String.format("Creating: %s %s", size, type));
  }

  public void bake() {
    System.out.println("Baking Cheese Pizza");
  }

  public void addToppings() {
    System.out.println("Cheese added");
  }

  public void addSauce() {
    System.out.println("Sauce applied");
  }

}
