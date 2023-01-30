import java.util.Arrays;

class Solution {
    public int[] solution(int[] values) {
        int[] answer = new int[2];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = 0;
        }
        boolean[] visited = new boolean[values.length];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }

        int asc = 0;
        boolean tag;
        boolean tag2;
        for (int i = 0; i < values.length -2; i++) {
            if(values[i] < values[i+1]) {
                if(values[i+1] < values[i+2]){
                    asc = 1;
                } else if(values[i+1] == values[i+2]) {
                    asc = 0;
                } else if (values[i+1] > values[i+2]){ // >
                    asc = -1;

                    tag2 = false;
                    for (int j = 0; j < visited.length; j++) {
                        if(visited[j] == true){
                            tag2 = true;
                            break;
                        }
                    }
                    if (tag2){
                        answer[1] = i + 1;
                        System.out.println("i: "+ i);
                        break;
                    }
                }
            }

            tag = true;
            if(asc == 1) {
                for (int j = 0; j < i; j++) {
                    if(visited[j] == true){
                        tag = false;
                        break;
                    }
                }
                if (tag){
                    answer[0] = i;
                    System.out.println("i :"+i);
                    visited[i] = true;
                }
            }
        }

        return answer;
    }
}

class Test {
    public static void main(String[] args){
        int[] numbers = {103, 152, 124, 165, 152, 154, 159, 160, 200, 195, 205, 206, 204, 189, 156};
        Solution sol = new Solution();
        int[] arr = sol.solution(numbers);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}