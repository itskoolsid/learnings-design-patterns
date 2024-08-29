package org.example.pattern.creational.builder;

public interface Builder<T> {
  public void setMake(final String make);
  public void setModel(final String model);
  public void setYear(final int year);
  public T buildProduct();
}
