import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        HashSet<Integer> removeDup = new HashSet<>();
        for (int num: arr){
            removeDup.add(num);
        }

        Iterator iter = removeDup.iterator();
        int comp = (int) iter.next();
        for(int num: removeDup){
            if(comp > num){
                comp = num;
            }
        }

        int cnt = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == comp){
                arr[i] = 0;
                cnt--;
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        answer = sum / cnt;
        return answer;
    }
}