import java.util.ArrayList;
import static java.lang.Math.pow;

class Solution {
    public int[] solution(int[] a, int[] b) {
        int[] answer = {};
        long sum1 = 0;
        long sum2 = 0;
        long total = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            sum1 += a[i] * pow(10, a.length-1-i);
        }

        for (int i = 0; i < b.length; i++) {
            sum2 += b[i] * pow(10, b.length-1-i);
        }

        total = sum1 + sum2;

        while(total > 0){   // 자릿수 구하기
            list.add((int) (total % 10));
            total /= 10;
        }

        answer = new int[list.size()];
        int j = 0;
        for (int i = answer.length-1; i >=0 ; i--) {
            answer[i] = list.get(j);
            j++;
        }
        return answer;
    }
}