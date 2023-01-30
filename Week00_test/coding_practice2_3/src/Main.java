public class Main {
    public static void main(String[] args) {
        int[] a = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = (i+a.length-1)*10;
            System.out.println("a[i] = " + a[i]);
        }
        Solution sol = new Solution();
        int ans = sol.solution(a);
        System.out.println("ans = " + ans);
    }
}