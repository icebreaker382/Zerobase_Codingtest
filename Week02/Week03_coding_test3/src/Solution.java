import java.util.Stack;

class Solution {
    public String solution(String code) {
        String answer = "";
        Stack stack = new Stack();

        for(String s: code.split("")){
            if(s.equals("}") && !stack.isEmpty()){
                String s2 = (String) stack.pop(); // } 제거
                System.out.println(s2);
                String temp = "";

                while(!s2.equals("{")){ // { 제거하고 종료
                    s2 = (String) stack.pop();
                    if(s2.equals("{")) break;
                    temp += s2;
                    System.out.println(temp);
                    System.out.println("실행됨");
                }
                int time = Integer.valueOf((String) stack.pop());
                for (int i = 0; i < time; i++) { // n번 만큼 반복
                    for(String a: temp.split("")){
                        stack.push(a);
                    }
                }
            } else{ // } 아닐 때
                stack.push(s);
            }
        }

        while(!stack.isEmpty()){
            answer += stack.pop();
        }

        return answer;
    }
}