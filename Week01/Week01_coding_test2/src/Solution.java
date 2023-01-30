import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int solution(String[] names) {
        HashSet lname = new HashSet();
        int answer = 0;

        for (int i = 0; i < names.length; i++) {
            lname.add(names[i]);
        }

        int gotyou = 4;
        int num = 1;
        int num2 = 1;

        for (int i = lname.size(); i > gotyou; i--) {
            num *= i;
        }
        for (int i = 1; i <= lname.size()-gotyou; i++) {
            num2 *= i;
        }

        answer = num / num2;

        return answer;
    }
}