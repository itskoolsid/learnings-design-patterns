package org.example.pattern.creational.builder;

public class CarBuilder implements Builder<Car> {

  private final Car car = new Car();

  @Override
  public void setMake(String make) {
    car.setMake(make);
  }

  @Override
  public void setModel(String model) {
    car.setModel(model);
  }

  @Override
  public void setYear(int year) {
    car.setYear(year);
  }

  @Override
  public Car buildProduct() {
    return this.car;
  }
}
