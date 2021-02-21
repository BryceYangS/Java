package chapter11_CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class CollectionsTest {


  public static void main(String[] args) {
    Map<String, String> test = new HashMap<>();

//    test.put("a", "haha");
    String a = test.getOrDefault("a", null);

    System.out.println(test);
    System.out.println(a);


  }
}
