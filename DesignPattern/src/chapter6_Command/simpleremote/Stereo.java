package chapter6_Command.simpleremote;

public class Stereo {

  private String location;

  public Stereo() {
  }

  public Stereo(String living_room) {
    location = living_room;
  }

  public void on() {
    System.out.println("Stereo is on");
  }

  public void off() {
    System.out.println("Stereo is off");
  }

  public void setCd() {
    System.out.println("set cd");
  }

  public void setDvd() {
    System.out.println("set Dvd");
  }

  public void setRadio() {
    System.out.println("set Radio");
  }

  public void setVolume(int volume) {
    System.out.println("set Volume : " + volume);
  }

}
