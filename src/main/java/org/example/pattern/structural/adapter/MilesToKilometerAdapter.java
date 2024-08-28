package org.example.pattern.structural.adapter;

public class MilesToKilometerAdapter implements MilesReader{
  private final CarEurope carEurope;

  public MilesToKilometerAdapter(final CarEurope carEurope) {
    this.carEurope = carEurope;
  }

  @Override
  public Double readInMiles() {
    final Double milesToKm = carEurope.readInKilometers()/1.603944;
    return milesToKm;
  }
}
