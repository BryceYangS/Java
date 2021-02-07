package chapter1_StrategyPattern.DuckBehavior;

public class Quack implements QuackBehavior{

  @Override
  public void quack() {
    System.out.println("꽥");
  }
}
