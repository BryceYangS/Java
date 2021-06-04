package etc;

public class SOl3 {

    public static int solution(int N, int K) {
        // write your code in Java SE 11
        if (N * (N+1) / 2 < K){
            return -1;
        }

        int neededGlass = 0;
        for (int i = N; i > 0; i--){
            if (i <= K){
                K -= i;
                neededGlass += 1;
            }
            if (K == 0){
                return neededGlass;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 8));
        System.out.println(solution(4, 10));
        System.out.println(solution(1, 2));
        System.out.println(solution(10, 5));
    }
}
