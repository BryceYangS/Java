package chapter2_Observer.weather;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class StatisticsDisplay implements Observer, DisplayElement {

  private List<Float> temperatures;
  private List<Float> humidities;
  private List<Float> pressures;

  private Subject weatherData;

  public StatisticsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    temperatures = new ArrayList<>();
    humidities = new ArrayList<>();
    pressures = new ArrayList<>();
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    Double temperaturesAvg = temperatures.stream().mapToDouble(a -> a).average().orElse(0);
    Double temperaturesMax = temperatures.stream().mapToDouble(a -> a).max().orElse(0);
    Double temperaturesMin = temperatures.stream().mapToDouble(a -> a).min().orElse(0);

    OptionalDouble huimiditeisAvg = humidities.stream().mapToDouble(a -> a).average();
    OptionalDouble pressuresAvg = pressures.stream().mapToDouble(a -> a).average();

    System.out.println("Avg/Max/Min temperature : " + temperaturesAvg + "/" + temperaturesMax + "/"
        + temperaturesMin);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    temperatures.add(temp);
    humidities.add(humidity);
    pressures.add(pressure);
    display();
  }
}
