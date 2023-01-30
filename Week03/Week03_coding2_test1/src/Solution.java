class Solution {
    public int solution(int[] useageArr, int fee) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < useageArr.length; i++) {
            sum += useageArr[i];
        }
        answer = sum * fee;
        return answer;
    }
}