package chapter1_StrategyPattern.Duck;

import chapter1_StrategyPattern.DuckBehavior.FlyNoWay;
import chapter1_StrategyPattern.DuckBehavior.Quack;

public class ModelDuck extends Duck{

  public ModelDuck(){
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("저는 모형 오리입니다.");
  }
}
