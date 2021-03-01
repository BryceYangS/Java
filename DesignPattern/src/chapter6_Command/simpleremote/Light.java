package chapter6_Command.simpleremote;

public class Light {

  private String location;

  public Light() {
    this.location = "";
  }

  public Light(String location) {
    this.location = location;
  }

  public void on() {
    System.out.println(location + "Light is on");
  }

  public void off() {
    System.out.println(location + "Light is off");
  }
}
