public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] s1 = new String[9];
        s1[0] = "제로";
        s1[1] = "베이스";
        s1[2] = "자바";
        s1[3] = "스쿨";
        s1[4] = "자바";
        s1[5] = "베이스";
        s1[6] = "베이스";
        s1[7] = "백엔드";
        s1[8] = "화이팅";
        int ans = sol.solution(s1);
        System.out.println("ans = " + ans);
    }
}