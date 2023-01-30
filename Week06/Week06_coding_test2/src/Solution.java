import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static int hold = new Integer(0);
    public String solution(int[] numbers) {
        String answer = "";

        int n = numbers.length; //배열의 길이
        int[] output = new int[n]; //순열 출력을 위한 배열
        boolean[] visited = new boolean[n]; //중복해서 뽑지 않기 위해 방문했는지를 체크하는 배열

        int num = fact(numbers.length);
        String[][] str = new String[num][numbers.length];

        permutations(numbers,output, visited, 0, n, numbers.length, str); //r = 3, 3개를 뽑을 것

        double res = 0;

        for (int i = 0; i < str.length; i++) {
            try {
                String s3 = "";
            for (int j = 0; j < numbers.length; j++) {
                s3 += str[i][j];
            }
            double n2 = Double.valueOf(s3);
            if(n2 > res){
                res = n2;
            }
            } catch(Exception NumberFormatException) {
                break;
            }
        }

        answer = String.valueOf((int)res);
        return answer;
    }

    public static int fact(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fact(n - 1) * n;
        }
    }

    public static void permutations(int[] arr, int[] output, boolean[] visited, int depth, int n, int r, String[][] str) {
        if(depth == r) {
//            ArrayList s = new ArrayList();
            for (int i = 0; i < output.length; i++) {
                str[hold][i] = String.valueOf(output[i]);
//                s.add(String.valueOf(output[i]));
            }
//            System.out.println(s);
            hold++;
            return;
        }

        for(int i = 0; i < n; i++) {
            if(visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                permutations(arr, output, visited, depth + 1, n, r, str);
                visited[i] = false;
            }
        }
    }
}