package org.example.pattern.structural.decorator;

public class CeramicPaint extends VehicleDecorator{
  public final Vehicle vehicle;

  public CeramicPaint(final Vehicle vehicle) {
    super(vehicle);
    this.vehicle = vehicle;
  }

  @Override
  public double getTotalPrice() {
    return vehicle.getTotalPrice()+1200.00;
  }
}
