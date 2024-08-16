package org.example.pattern.behavioral.strategy;

import org.example.pattern.behavioral.strategy.strategies.EmailDeliveryStrategy;
import org.example.pattern.behavioral.strategy.strategies.SmsDeliveryStrategy;

/**
 * This class uses various strategies based on the requirement
 */
public class Client {
  private DeliveryStrategy deliveryStrategy;

  public void setDeliveryStrategy(final DeliveryStrategy deliveryStrategy) {
    this.deliveryStrategy = deliveryStrategy;
  }

  public void doDeliver() {
    deliveryStrategy.deliver();
  }

  public static void main(String[] args) {

    final Client client = new Client();

    final DeliveryStrategy smsDeliveryStrategy = new SmsDeliveryStrategy();
    client.setDeliveryStrategy(smsDeliveryStrategy);
    client.doDeliver();

    final DeliveryStrategy emaDeliveryStrategy = new EmailDeliveryStrategy();
    client.setDeliveryStrategy(emaDeliveryStrategy);
    client.doDeliver();
  }
}
