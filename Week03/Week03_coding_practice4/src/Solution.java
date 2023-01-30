import java.util.HashSet;

class Solution {
    public int solution(String str) {
        int answer = 0;
        HashSet<String> removeDup = new HashSet<>();
        for (String s: str.split(" ")){
            removeDup.add(s);
        }

        for (int i = 0; i < removeDup.size(); i++) {
            answer++;
        }

        return answer;
    }
}