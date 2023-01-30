class Solution {
    public int solution(int N) {
        int answer = 0;
        int[] beer = new int[N];
        beer[0] = 1;
        beer[1] = 2;

        for (int i = 2 ; i < N ; i++) {
            int num = beer[i-1] + beer[i-2];
            beer[i] = num % 100000000;
        }
        answer = beer[N-1];
        return answer;
    }
}