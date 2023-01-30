import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Solution {
    public String[] solution(String s) {
        String[] answer = {};
        List<String> newans = new ArrayList<>();
        String temp2 = "";
        char ch;

        int depth = 0;
        StringTokenizer st = new StringTokenizer(s, ",.?! ");
        while (st.hasMoreElements()) {
            String temp = st.nextToken();
            
            for (int i = 0; i < temp.length(); i++) {
                ch = temp.charAt(temp.length()-1-i);
                temp2 += ch;
            }
            newans.add(temp2);
            temp2 = "";
            depth++;
        }
        answer = newans.toArray(new String[newans.size()]);
        return answer;
    }
}