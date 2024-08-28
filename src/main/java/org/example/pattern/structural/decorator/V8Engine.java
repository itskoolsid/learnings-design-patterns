package org.example.pattern.structural.decorator;

public class V8Engine extends VehicleDecorator {

  public final Vehicle vehicle;

  public V8Engine(final Vehicle vehicle) {
    super(vehicle);
    this.vehicle = vehicle;
  }

  @Override
  public double getTotalPrice() {
    return vehicle.getTotalPrice() + 10000.00;
  }
}
