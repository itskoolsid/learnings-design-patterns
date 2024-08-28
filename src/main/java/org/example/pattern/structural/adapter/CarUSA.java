package org.example.pattern.structural.adapter;

public class CarUSA implements MilesReader{

  private final Double mileage;

  public CarUSA(final Double mileage) {
    this.mileage = mileage;
  }

  @Override
  public Double readInMiles() {
    return mileage;
  }
}
