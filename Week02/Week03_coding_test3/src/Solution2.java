// https://haruhiism.tistory.com/158
import java.util.Stack;

public class Solution2 {
    public String solution(String code) {
        Stack<Integer> num = new Stack<>();
        Stack<StringBuilder> str = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (char ch : code.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                i = i * 10 + (ch - '0');
            } else if (ch == '{') {
                num.push(i);
                str.push(sb);
                sb = new StringBuilder();
                i = 0;
            } else if (ch == '}') {
                StringBuilder decodeStr = str.pop();
                for (int times = num.pop(); times > 0; times --) {
                    decodeStr.append(sb);
                }
                sb = decodeStr;
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

}
