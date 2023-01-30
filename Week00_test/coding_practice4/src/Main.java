import java.lang.String;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "174771177";
        // Integer 값은 최대 2147483647 라서 17477117755 부터는 에러가 생김
        // double 로 변환하면 괜찮을거임
        int ans = sol.solution(s1);
        System.out.println("ans = " + ans);
    }
}