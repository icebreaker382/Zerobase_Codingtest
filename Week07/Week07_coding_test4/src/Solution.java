import java.util.ArrayDeque;
// https://sysgongbu.tistory.com/150
// 윈도우 슬라이딩 - deque 사용
class Solution {
    public void moveWindow(int i, int k, ArrayDeque<Integer> deque, int[] nums) {
        if (!deque.isEmpty() && deque.getFirst() == i - k) {
            deque.removeFirst();
        }

        while (!deque.isEmpty() && nums[i] > nums[deque.getLast()]) {
            deque.removeLast();
        }
    }

    public int[] solution(int[] arr, int k) {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        int length = arr.length;
        if (length * k == 0) {
            return new int[0];
        }
        if (k == 1) {
            return arr;
        }

        int maxIndex = 0;
        for (int i = 0; i < k; i++) {
            moveWindow(i, k, deque, arr);
            deque.addLast(i);

            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        int[] answer = new int[length - k + 1];
        answer[0] = arr[maxIndex];

        for (int i = k; i < length; i++) {
            moveWindow(i, k, deque, arr);
            deque.addLast(i);
            answer[i - k + 1] = arr[deque.getFirst()];
        }
        return answer;
    }
}