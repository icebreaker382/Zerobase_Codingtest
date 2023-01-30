public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 4;
        int[][] trust = {{1, 2}, {1, 4}, {1, 3}, {2, 1}, {4, 3}};
        //int[][] trust = {{1,3},{2,3}};
        int ans = sol.solution(N, trust);
        System.out.println("ans = " + ans);
    }
}