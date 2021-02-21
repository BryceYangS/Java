package chapter14_lambda_stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalTest {

  public static void main(String[] args) {
    Map<String, String> test = new HashMap<>();
    String orDefault = test.getOrDefault("a", "asdf");

    List<String> listTest = new ArrayList<>();
    List<String> stringStream = listTest.stream().filter(str -> "haha".equals(str))
        .collect(Collectors.toList());

    Optional<Map> optionalTest = Optional.of(test);


  }

}
