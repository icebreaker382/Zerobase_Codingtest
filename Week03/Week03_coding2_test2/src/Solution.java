import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1){
                list.add(arr[i]);
                list.add(arr[i]);
            } else{
                list.add(arr[i]);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            list2.add(list.get(i));
        }

        answer = list2.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}