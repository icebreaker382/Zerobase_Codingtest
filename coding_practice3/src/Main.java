public class Main {
    public static void main(String[] args) {
        Solution so = new Solution();
        int[] arr = new int[5];
        arr[0] = 100000;
        arr[1] = 99000;
        arr[2] = 99000;
        arr[3] = 98000;
        arr[4] = 97000;

        int ans = so.solution(arr);
        System.out.println("ans = " + ans);
    }
}