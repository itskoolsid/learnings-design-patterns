package org.example.pattern.structural.decorator;

public abstract class Vehicle {
  private final String make;
  private final String model;
  private final Double basePrice;

  public Vehicle(final String make, final String model, final Double basePrice) {
    this.make = make;
    this.model = model;
    this.basePrice = basePrice;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public Double getBasePrice() {
    return basePrice;
  }

  public abstract double getTotalPrice();
}
