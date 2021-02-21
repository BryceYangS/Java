package chapter4_Factory.pizzastore;

import chapter4_Factory.pizza.ChicagoStyleCheesePizza;
import chapter4_Factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {


  @Override
  protected Pizza createPizza(String type) {
    return switch (type) {
      case "cheese" -> new ChicagoStyleCheesePizza();
      default -> null;
    };
  }
}
