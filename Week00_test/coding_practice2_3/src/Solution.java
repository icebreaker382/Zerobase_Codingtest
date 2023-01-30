class Solution {
    static int gcd(int a, int b){
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }
    public int solution(int[] A) {
        int result = 0;
        int[] arr = new int[A.length-1];

        for (int i = 0; i < A.length-1; i++) {
            arr[i] = gcd(A[0], A[i+1]);
        }

        int temp = arr[0];
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i] < temp){
                temp = arr[i];
            }
        }
        if(temp == 0){
            temp = 1;
        }
        result = temp;

        return result;
    }
}
