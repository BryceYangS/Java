package chapter1_StrategyPattern.Duck;

import chapter1_StrategyPattern.DuckBehavior.FlyWithWings;
import chapter1_StrategyPattern.DuckBehavior.Quack;

public class MallardDuck extends Duck{

  public MallardDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("저는 물오리 입니다.");
  }

}
