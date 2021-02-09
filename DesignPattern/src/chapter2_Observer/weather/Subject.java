package chapter2_Observer.weather;

public interface Subject {

  public void registerObserver(Observer o);

  public void removeObserver(Observer o);

  public void notifyObserver();
}
