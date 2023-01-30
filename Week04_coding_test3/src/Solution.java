class Solution {
    public static int permutation(int N){
        if(N <= 1){
            return N+1;
        } else{
            result = N + (int) Math.pow(2,N-2);
            return N += permutation(N-1) ;
        }
    }
    public int solution(int delay, int N) {
        int answer = 0;
        int sum = 0;

        return answer;
    }
}