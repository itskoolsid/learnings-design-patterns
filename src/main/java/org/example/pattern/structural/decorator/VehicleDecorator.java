package org.example.pattern.structural.decorator;

public abstract class VehicleDecorator extends Vehicle {

  public VehicleDecorator( final Vehicle vehicle) {
    super(vehicle.getMake(), vehicle.getModel(), vehicle.getBasePrice());
  }
}
