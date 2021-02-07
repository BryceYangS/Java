package chapter1_StrategyPattern.Duck;

import chapter1_StrategyPattern.DuckBehavior.FlyBehavior;
import chapter1_StrategyPattern.DuckBehavior.QuackBehavior;

public abstract class Duck {

  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public abstract void display();

  public void performFly(){
    flyBehavior.fly();
  }

  public void performQuack(){
    quackBehavior.quack();
  }

  public void swin(){
    System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
  }


  public void setFlyBehavior(FlyBehavior fb){
    this.flyBehavior = fb;
  }

  public void setQuackBehavior(QuackBehavior qb){
    this.quackBehavior = qb;
  }
}
