class Solution {
    public int solution(int[] A) {
        int answer = 0;
        int num = 0;
        for(int i=1; i<A.length; i++){
            num += i;
        }
        int[] arr = new int[num];

        int num2 = 0;
        for(int i=0; i<A.length; i++){
            for(int j=i+1; j<A.length; j++){
                arr[num2] = A[i] - A[j];
                num2++;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println("arr[i] = " + arr[i]);
            if(arr[i]>answer) {
                answer = arr[i];
                System.out.println("answer = " + answer);
            }
        }
        return answer;
    }
}