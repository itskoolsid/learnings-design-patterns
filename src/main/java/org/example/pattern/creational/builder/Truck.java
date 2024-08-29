package org.example.pattern.creational.builder;

import java.util.StringJoiner;

public class Truck {
  private String make;
  private String model;
  private int year;

  public String getMake() {
    return make;
  }

  public void setMake(final String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(final String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(final int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Truck.class.getSimpleName() + "[", "]")
        .add("make='" + make + "'")
        .add("model='" + model + "'")
        .add("year=" + year)
        .toString();
  }
}
