package chapter1_StrategyPattern.DuckBehavior;

public class FlyWithWings implements FlyBehavior{

  @Override
  public void fly() {
    System.out.println("날고 있어요");
  }
}
