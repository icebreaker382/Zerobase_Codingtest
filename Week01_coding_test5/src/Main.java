public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 10;
        int M = 3;
        int K = 4;
        int[] capacity = {3,3,4};
        long ans = sol.solution(N,M,K,capacity);
        System.out.println("ans = " + ans);
    }
}