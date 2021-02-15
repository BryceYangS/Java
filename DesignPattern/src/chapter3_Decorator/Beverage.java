package chapter3_Decorator;

enum Size {
  TALL, GRANDE, BENTI
}

public abstract class Beverage {

  protected String description = "제목 없음";
  protected Size size;

  public String getDescription() {
    return description;
  }

  public abstract double cost();

  public Size getSize() {
    return size;
  }

  public void setSize(Size size) {
    this.size = size;
  }
}