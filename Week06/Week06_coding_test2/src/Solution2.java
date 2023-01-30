import java.util.Arrays;

class Solution2 {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(numbers)
                .boxed()
                .sorted((x, y) -> {
                    int a = Integer.parseInt(String.valueOf(x) + String.valueOf(y));
                    int b = Integer.parseInt(String.valueOf(y) + String.valueOf(x));
                    return b - a; // return a-b;    오름차순
                })  // .Comparator.reverseOrder(); -> 내림차순
                .forEach(sb::append);
        String result = sb.toString();
        return result.charAt(0)=='0'? "0":result;
    }
}

class Test {
    public static void main(String[] args){
        int[] numbers = {3, 30, 34, 5, 9};
        System.out.println(new Solution2().solution(numbers));
    }
}