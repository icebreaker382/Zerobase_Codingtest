import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr1, int[] arr2) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i: arr1){
            for(int j: arr2){
                if(i == j){
                    list.add(j);
                }
            }
        }


        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(arr);
        answer = arr;

        return answer;
    }
}