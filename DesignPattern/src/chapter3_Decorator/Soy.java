package chapter3_Decorator;

public class Soy extends CondimentDecorator {

  Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

//  @Override
//  public Size getSize() {
//    return beverage.getSize();
//  }

  @Override
  public double cost() {
    double cost = beverage.cost();
    switch (beverage.getSize()) {
      case TALL -> cost += .10;
      case BENTI -> cost += .15;
      case GRANDE -> cost += .20;
    }

    return cost;
  }


  @Override
  public String getDescription() {
    return beverage.getDescription() + ", 두유";
  }
}
