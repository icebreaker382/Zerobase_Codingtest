class Solution {
    public int solution(int N, int[][] trust) {
        int answer = 0;
        // a: 주민, b: 판사
        // flag 설정, n 번호로 돌려서?
        // [i][0]: 주민, [i][1]: 판사
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < trust.length; i++) {
            if(trust[i][1] <= N){
                int n = trust[i][1];
                arr[n-1] = 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if(arr[i] == 1){
                answer = i+1;
                sum += arr[i];
            }
        }
        for (int i = 0; i < trust.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]==1){
                    if(trust[i][0] == j+1){
                        answer = -1;
                    }
                }
            }
        }
        if(sum > 1) {
            answer = -1;
        }

        return answer;
    }
}