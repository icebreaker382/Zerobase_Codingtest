class Solution {
    int result = 0;

    public int permutation(int[] arr, int depth, int n, int r) {
        // depth:0, n:arr.length, r:3 시작
        int ans = 0;
        if(depth == r){
            int[] test = new int[3];
            int idx = 0;
            for (int i = 0; i < r; i++) {
                test[idx] = arr[i];
                System.out.println(idx);
                idx++;
            }
            if(triangle(test[0],test[1],test[2])){
                ans = test[0] + test[1] + test[2];
            }
            if(result < ans) result = ans;
        }
        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth+1, n, r);
            swap(arr, depth, i);
        }
        return result;
    }

    public boolean triangle(int a, int b, int c){
        if(a >= b && a >= c){
            if(a< (b+c)) return true;
            else return false;
        } else if(b >= a && b >= c){
            if(b < (a+c)) return true;
            else return false;
        } else if(c >= a && c>= b){
            if(c < (a+b)) return true;
            else return false;
        }
        return false;
    }

    void swap(int[] arr, int depth, int idx){
        int tap = arr[depth];
        arr[depth] = arr[idx];
        arr[idx] = tap;
    }
    public int solution(int[] arr) {
        int answer = 0;
        answer = permutation(arr, 0, arr.length, 3);
        return answer;
    }
}