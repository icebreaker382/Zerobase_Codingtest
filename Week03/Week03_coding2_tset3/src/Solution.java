class Solution {
    public int solution(int num) {
        int answer = 0;
        int temp = 0;
        int comp = 0;
        int tmp = 0;

        for (int i = 2; i <= num / Math.pow(2, -3) ; i++) {
            temp = (int) Math.pow(i,3);
            if(temp < num){
                tmp = (int) Math.pow(i,3);
            }
            else break;
            if(comp < tmp) {
                comp = tmp;
            }
        }
        answer = comp;

        return answer;
    }
}