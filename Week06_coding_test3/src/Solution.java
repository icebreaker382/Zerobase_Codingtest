public class Solution {
    public int solution(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid + 1] < arr[mid]) {
                if (arr[mid - 1] < arr[mid]) {
                    return mid;
                } else {
                    right = mid;
                }
            } else {
                left = mid;
            }
        }
        return -1;
    }
}