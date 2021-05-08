public class Sol1 {
    public static int solution(int N) {
        // write your code in Java SE 11
        int leng = Integer.toString(N).length();

        return leng == 1 ? 0 : (int)Math.pow(10, leng - 1);
    }

    public static void main(String[] args) {
        System.out.println(solution(125));
        System.out.println(solution(1));

    }

}
