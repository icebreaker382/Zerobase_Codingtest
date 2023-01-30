import java.util.*;

class Solution {
    public int solution(int[] votes) {
        int answer = 0;
        int max = Arrays.stream(votes).max().getAsInt();
        int[] cntArr = new int[max+1];

        for (int i = 0; i < votes.length; i++) {
            cntArr[votes[i]]++;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int item: votes){
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        int maxIdx = -1;
        int maxNum = -1;
        for (Map.Entry<Integer, Integer> pair: map.entrySet()){
            if (maxIdx < pair.getValue()){
                maxIdx = pair.getValue();
                maxNum = pair.getKey();
            }
        }
        answer = maxNum;
        return answer;
    }
}