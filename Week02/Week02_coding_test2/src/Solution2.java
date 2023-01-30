import java.util.ArrayList;
import static java.lang.Math.pow;

class Solution2 {
    public int[] solution(int[] a, int[] b) {
        int[] answer = {};
        long sum1 = 0;
        long sum2 = 0;
        long total = 0;

        String s1 = "";
        String s2 = "";
        String s3 = "";

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            s1 += String.valueOf(a[i]);
            System.out.println(s1);
        }
        for (int i = 0; i < b.length; i++) {
            s2 += String.valueOf(b[i]);
        }

        sum1 = Long.valueOf(s1);
        System.out.println(s1);
        sum2 = Long.valueOf(s2);
        total = sum1 + sum2;
        System.out.println(s2);

        s3 = String.valueOf(total);
        System.out.println(s3);

        for (int i = 0; i < s3.length(); i++) {
            list.add(String.valueOf(s3.charAt(i)));
            System.out.print(list.get(i));
        }
        System.out.println();
        System.out.println(list.size());

        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(list.get(i));
        }
        return answer;
    }
}