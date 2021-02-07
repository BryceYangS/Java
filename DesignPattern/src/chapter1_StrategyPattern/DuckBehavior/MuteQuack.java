package chapter1_StrategyPattern.DuckBehavior;

public class MuteQuack implements QuackBehavior{

  @Override
  public void quack() {
    System.out.println("<< 조용 ~ >>");
  }
}
