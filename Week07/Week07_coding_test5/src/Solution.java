class Solution {
    public int[] solution(int[] scores) {
        int[] answer = {};
        answer = new int[scores.length];
        answer[0] = 1;
        if(scores[0] >= scores[1]){
            answer[0] = 2;
        }
        for (int i = 1; i < scores.length; i++) {
            if(scores[i-1] <= scores[i]){
                answer[i] = answer[i-1]+1;
                if(i > 2){
                    if(scores[i-1]==scores[i]) {
                        answer[i] = 1;
                    }
                    if(scores[i-2] == scores[i]){
                        answer[i] = answer[i-1] + 1;
                    }
                }
            } else {
                answer[i] = 1;
            }
        }
        return answer;
    }
}

class Test{
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] scores = {6, 3, 5, 9, 5, 5, 5, 1};
        int[] ans = sol.solution(scores);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}