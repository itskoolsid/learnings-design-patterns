package org.example.pattern.creational.builder;

public class TruckBuilder implements Builder<Truck> {
  private final Truck truck = new Truck();

  @Override
  public void setMake(String make) {
    truck.setMake(make);
  }

  @Override
  public void setModel(String model) {
    truck.setModel(model);
  }

  @Override
  public void setYear(int year) {
    truck.setYear(year);
  }

  @Override
  public Truck buildProduct() {
    return this.truck;
  }
}
