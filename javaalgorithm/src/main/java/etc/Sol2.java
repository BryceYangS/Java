package etc;

import java.util.Arrays;
import java.util.Collections;

public class Sol2 {
    public static int solution(int[] A) {
        // write your code in Java SE 11
        Integer[] integerArr = Arrays.stream(A).boxed().toArray(Integer[]::new);

        Arrays.sort(integerArr, Collections.reverseOrder());

        for (int num : integerArr) {
            if (num <= 0){
                break;
            }
            if(Arrays.stream(integerArr).anyMatch(number -> number == -num)){
                return num;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,2,-2,5,-3}));
    }
}
