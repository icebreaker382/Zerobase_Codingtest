import java.util.Random;

public class Solution {
    public boolean solution(int num) {
        boolean answer = true;
        Random rand = new Random();
        int heng = num;
        int nuna = num;

        while((heng == 1)||(nuna == 1)){
            if(heng<0 || nuna <0)
                break;
            int num1 = rand.nextInt(3)+1;
            int num2 = rand.nextInt(3)+1;
            heng -= num1;
            nuna -= num2;
            System.out.println(heng);
        }

        if(heng < 1)   answer = false;

        return answer;
    }
}