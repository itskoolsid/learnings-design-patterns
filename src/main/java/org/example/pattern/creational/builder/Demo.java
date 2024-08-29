package org.example.pattern.creational.builder;

/**
 * Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows
 * you to produce different types and representations of an object using the same construction code.
 */
public class Demo {
  public static void main(String[] args) {
    Builder<Car> carBuilder = new CarBuilder();
    carBuilder.setMake("BMW");
    carBuilder.setYear(2025);
    carBuilder.setModel("X10");

    Car car = carBuilder.buildProduct();
    System.out.println(car);

    Builder<Truck> truckBuilder = new TruckBuilder();
    truckBuilder.setMake("Hittachi");
    truckBuilder.setYear(2025);
    truckBuilder.setModel("S100");

    Truck truck = truckBuilder.buildProduct();
    System.out.println(truck);

    Builder<Car> carBuilderWithNoYear = new CarBuilder();
    carBuilderWithNoYear.setMake("BMW");
    carBuilderWithNoYear.setModel("X10");

    Car car2 = carBuilderWithNoYear.buildProduct();
    System.out.println(car2);
  }
}
