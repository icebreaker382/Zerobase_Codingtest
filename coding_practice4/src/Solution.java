import java.util.Arrays;
import static java.lang.Math.pow;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int[] arr = new int[s.length()];
        int num = Integer.parseInt(s);

        int init = 0;
        for(int i=s.length(); i>0; i--){
            arr[init] = (int) (num / (1 * pow(10,i-1)));
            num %= (int)(1 * pow(10,i-1));
            init++;
        }

        // 0~9 저장 배열
        int[] arr2 = new int[10];

        // 0~9 count
        for(int i=0; i<arr.length; i++){
            int n = arr[i];
            arr2[n] +=1;
        }

        // 초기화
        int[] arr3 = new int[10];
        for (int i = 0; i <arr3.length; i++) {
            arr3[i] = 0;
        }
        int fin = 0;
        
        // 가장 많은 수 arr3 저장  -> 1-3, 7-5
        for(int i=0; i<arr2.length; i++){
            if(arr2[i] > fin) {
                fin = arr2[i];
                arr3[i] = fin;
            }
        }

        // 많은 수들 중 ""가장 작은 수"" 저장
        for(int i=0; i<arr2.length; i++){
            for(int j=i+1; j<arr3.length; j++){
                if((arr3[i]!=0) && (arr3[j] !=0)){
                    if(arr3[i] > arr3[j]){  // i는 항상 j보다 작음
                        answer = i;
                        break;
                    }
                    else if(arr3[i] == arr3[j]){    // 많은 수들이 여러 개일 때
                        if(i < j) answer = i;
                        else answer = j;
                        break;
                    }
                    else if(arr3[i] < arr3[j]){
                        answer = j;
                        break;
                    }
                }
            }
        }

        return answer;
    }
}