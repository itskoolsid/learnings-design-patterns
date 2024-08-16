package org.example.pattern.behavioral.strategy.strategies;

import org.example.pattern.behavioral.strategy.DeliveryStrategy;

/**
 * Concrete implementation of DeliveryStrategy
 */
public class SmsDeliveryStrategy implements DeliveryStrategy {
  @Override
  public void deliver() {
    System.out.println("Delivery by SMS");
  }
}
