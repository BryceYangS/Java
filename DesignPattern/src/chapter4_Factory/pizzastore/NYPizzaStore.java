package chapter4_Factory.pizzastore;

import chapter4_Factory.pizza.NYStyleCheesePizza;
import chapter4_Factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    return switch (type) {
      case "cheese" -> new NYStyleCheesePizza();
      default -> null;
    };
  }
}
