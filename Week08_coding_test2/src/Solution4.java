import java.util.ArrayList;

public class Solution4 {
    public int[] solution(String nums) {
        int[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> number = new ArrayList<>();

        for (String s: nums.split("")){
            list.add(s);
        }


        for (int i = 0; i < list.size(); i++) {
            int key = Integer.valueOf(list.get(i));

        }

        return answer;
    }
}
