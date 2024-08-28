package org.example.pattern.structural.adapter;

/**
 * The Adapter Pattern converts the interface of a class into another interface the clients expect.
 * Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.
 */
public class Demo {
  public static void main(String[] args) {
    final Double mileage = 55355.00;

    final CarEurope carEurope = new CarEurope(mileage);
    final Double inKm = carEurope.readInKilometers();
    System.out.printf("Mileage in KM: %s%n", inKm);


    final CarUSA carUSA = new CarUSA(mileage);
    final Double inMiles = carUSA.readInMiles();
    System.out.printf("Mileage in Miles: %s%n", inMiles);


    final MilesToKilometerAdapter adapter = new MilesToKilometerAdapter(carEurope);
    final Double converted = adapter.readInMiles();
    System.out.printf("Mileage in Km from Miles: %.2f", converted);

  }
}
