package org.example.pattern.structural.decorator;

/**
 * Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects
 * inside special wrapper objects that contain the behaviors.
 */
public class Demo {
  public static void main(String[] args) {
    Vehicle audi = new Car("Audi", "Q7", 80000.00);
    System.out.printf("Audi's base price: %s%n", audi.getBasePrice());

    VehicleDecorator ceramicPaintedAudi = new CeramicPaint(audi);
    System.out.printf("Ceramic Painted Audi's price: %s%n", ceramicPaintedAudi.getTotalPrice());

    VehicleDecorator v8EnginedAudi = new V8Engine(ceramicPaintedAudi);
    System.out.printf("Ceramic Painted + V8 Engined Audi's price: %s", v8EnginedAudi.getTotalPrice());


  }
}
