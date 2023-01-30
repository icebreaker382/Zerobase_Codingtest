import java.util.ArrayList;

import static java.lang.Math.pow;

class Solution {
    public int solution(int num) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while(num != 0){
            list.add(num % 10);
            num /= 10;
        }

        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * pow(10,list.size()-1-i);
        }

        return answer;
    }
}