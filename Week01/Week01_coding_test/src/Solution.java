class Solution {
    public int solution(int n) {
        int answer = 0;

        if(n<=3){
            answer = 2;
            return answer;
        }
        else if(n>3){
            for(int i=4; i<=n; i++){
                boolean Flag = true;
                for(int j=2; j<=(i/2); j++){
                    if(i%j == 0) {
                        Flag = false;
                    }
                }
                if(Flag){
                    System.out.println("i = " + i);
                    answer++;
                }
            }

        }
        answer += 2;
        return answer;
    }
}