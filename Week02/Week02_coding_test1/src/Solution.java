import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != numbers[i+1] -1){
                answer = numbers[i] + 1;
                break;
            }
        }
        return answer;
    }
}