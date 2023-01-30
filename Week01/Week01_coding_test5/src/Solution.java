class Solution {
    static int a = 0;
    static int b = 2;
    public static int fact(int n) {
        if (n <= 1)
            return n;
        else
            return fact(n-1) * n;
    }

    public static int Comb(int a, int b){
        int num = 1;
        if(a==b){
            int result = 1;
            return result;
        }
        for (int i = a; i > a-b; i--) {
            num *= i;
            System.out.println("comb num = " + num);
        }
        int result = num / fact(b);
        System.out.println("result = " + result);
        return result;
    }

    public static long calculator(int N, int M, int K, int[] capacity, int ans){
        int num = N;

        if(num <= capacity[capacity.length-1]){
            ans *= Comb(N,capacity[b]);
            String mmm = String.format("%d, %d",N,capacity[b]);
            System.out.println(mmm);
            b--;
            System.out.println("b = " + b);
            System.out.println("ans: "+ans);
        }
        else {
            num -= capacity[a];
            System.out.println("num = " + num);
            calculator(num, M, K, capacity, ans);
            a++;
            System.out.println("a = " + a);
        }
        return (long)ans;
    }
    public long solution(int N, int M, int K, int[] capacity) {
        long answer = 0;
        long student = 0;
        long admin = 1;
        for(int i=K; i>K-M; i--){
            admin *= i;
        }
        int ans = 1;
        student = calculator(N+capacity[0], M, K, capacity, ans);
        System.out.println("student = " + student);
        answer = student * admin;

        return answer;
    }
}