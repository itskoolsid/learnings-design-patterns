package org.example.pattern.structural.adapter;

public class CarEurope implements KilometerReader{
  private final Double mileage;

  public CarEurope(final Double mileage) {
    this.mileage = mileage;
  }

  @Override
  public Double readInKilometers() {
    return mileage;
  }
}
