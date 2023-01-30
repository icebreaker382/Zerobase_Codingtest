import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "Hello, World?!";
        String[] ans = sol.solution(s);
        for (int i = 0; i < ans.length; i++) {
            System.out.printf("ans[%d] = %s\n" ,i,ans[i]);
        }
    }
}