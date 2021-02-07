package chapter1_StrategyPattern.DuckBehavior;

public class Sqeak implements QuackBehavior{

  @Override
  public void quack() {
    System.out.println("삐이익");
  }
}
