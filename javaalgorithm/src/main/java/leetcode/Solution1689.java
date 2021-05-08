package leetcode;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution1689 {
    public int minPartitions(String n) {
        int[] numArr = Stream.of(n.split("")).mapToInt(Integer::parseInt).toArray();
        return Arrays.stream(numArr).max().getAsInt();
    }

    public static void main(String[] args) {
        Solution1689 a = new Solution1689();
        System.out.println(a.minPartitions("32"));
        System.out.println(a.minPartitions("82734"));
    }
}
