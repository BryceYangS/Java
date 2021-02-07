package chapter1_StrategyPattern;

import chapter1_StrategyPattern.Duck.Duck;
import chapter1_StrategyPattern.Duck.MallardDuck;
import chapter1_StrategyPattern.Duck.ModelDuck;
import chapter1_StrategyPattern.DuckBehavior.FlyRocketPowered;
import chapter1_StrategyPattern.DuckBehavior.MuteQuack;

public class MiniDuckSimulator {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.display();
    mallard.performFly();
    mallard.performQuack();

    System.out.println("=================");

    Duck model = new ModelDuck();
    model.performFly();
    model.performQuack();

    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();

    model.setQuackBehavior(new MuteQuack());
    model.performQuack();


  }

}
