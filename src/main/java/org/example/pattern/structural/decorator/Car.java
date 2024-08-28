package org.example.pattern.structural.decorator;

public class Car extends Vehicle {
  public Car(String make, String model, Double basePrice) {
    super(make, model, basePrice);
  }

  @Override
  public double getTotalPrice() {
    return getBasePrice();
  }
}
