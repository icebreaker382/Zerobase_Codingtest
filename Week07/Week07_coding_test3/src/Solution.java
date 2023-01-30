import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int solution(String[] ingredients, String[] items) {
        int answer = 0;
        boolean[] visited = new boolean[ingredients.length];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        HashSet<String> hash = new HashSet<>();
        for(String s: ingredients){
            hash.add(s);
        }

        boolean flag;
        int start = -1;
        int end = -1;
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            flag = false;
            if(hash.size() == 0){
                break;
            }
            for (int j = 0; j < visited.length; j++) {
                if (visited[j] == false) {
                    flag = true;
                    break;
                }
            }
            if(flag){ // 아직 완성 안 됨
                boolean flag2 = false;
                for (int j = 0; j < ingredients.length; j++) {
                    if(ingredients[j] == items[i])
                        visited[j] = true;
                }

                for (int j = 0; j < ingredients.length; j++) {
                    if(visited[j] == true){
                        flag2 = true;
                    }
                }
                if(flag2){  // 하나라도 방문했다면
                    size++;
                    System.out.println(i);
                }
            } else { // 완성됨
                break;
            }
        }
        return size;
    }
}

class Test {
    public static void main(String[] args){
        String[] ing = {"생닭", "인삼", "소주", "대추"};
        String[] items = {"물", "인삼", "커피", "생닭", "소주", "사탕", "생닭", "대추", "쌀"};
        Solution sol = new Solution();
        int answer = sol.solution(ing, items);
        System.out.println("answer = " + answer);
    }
}