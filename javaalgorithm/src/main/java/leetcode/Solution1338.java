package leetcode;

import java.util.*;

public class Solution1338 {
    public static int minSetSize(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        final int totalLength = arr.length;
        final int halfLength = totalLength / 2;

        for (Integer num: arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> keySetList = new ArrayList<>(countMap.keySet());
        Collections.sort(keySetList, ((o1, o2) -> countMap.get(o2).compareTo(countMap.get(o1))));

        int length = totalLength;
        int count = 0;
        for (int key: keySetList) {
            count += 1;
            length -= countMap.get(key);
            if (length <= halfLength){
                return count;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(minSetSize(new int[]{3,3,3,3,5,5,5,2,2,7}));
    }
}
