package chapter2_Observer.weather;

public interface Observer {

  public void update(float temp, float humidity, float pressure);
}
