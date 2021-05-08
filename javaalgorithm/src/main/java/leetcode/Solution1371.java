package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution1371 {
    public static int findTheLongestSubstring(String s) {
        List<Integer> vowelIndex = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if ("a".equals(s.charAt(i)) || "e".equals(s.charAt(i)) || "i".equals(s.charAt(i)) || "o".equals(s.charAt(i)) || "u".equals(s.charAt(i))) {
                vowelIndex.add(i);
            }
        }

        int rtnLength = 0;
        for (int i = 0; i < vowelIndex.size(); i++) {

            for (int j = i + 1; j < vowelIndex.size(); j++) {

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findTheLongestSubstring("eleetminicoworoep"));
    }
}
