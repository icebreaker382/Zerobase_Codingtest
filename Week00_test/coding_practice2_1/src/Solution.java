class Solution {
    public String solution(int n, String s, int t) {
        String answer = "";
        String temp = "";
        String temp2 = "";
        for (int i = 0; i < n; i++) {
            temp += ".";
        }
        temp = temp.concat(s);
        System.out.println(temp);

        for (int i = 0; i < t; i++) {
            char tmp = temp.charAt(0);
            temp += tmp;
            temp = temp.substring(1);
        }

        System.out.println("s.length() = " + s.length());
        answer = temp.substring(0, n);
        return answer;
    }
}