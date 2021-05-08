package leetcode;

import java.util.Arrays;

public class Solution1769 {
    public int[] minOperations(String boxes) {
        String[] tmp = boxes.split("");
        int[] rtnArr = new int[tmp.length];

        for (int i=0; i < tmp.length; i++){
            int sum = 0;
            for (int j=0; j < tmp.length; j++){
                if (i == j ||"0".equals(tmp[j])){
                    continue;
                }
                sum += Math.abs(i-j);
            }
            rtnArr[i] = sum;
        }

        return rtnArr;
    }

    public static void main(String[] args) {
        Solution1769 s = new Solution1769();
        System.out.println(s.minOperations("110"));
    }
}
