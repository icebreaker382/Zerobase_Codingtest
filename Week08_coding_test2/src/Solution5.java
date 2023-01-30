import static java.lang.Math.max;

class Solution5 {
    static long[] psumArr;
    static int[] saveNum;
    static long result = 0;
    public int solution(int[] nums) {
        int answer = 0;

        int ret = 0;
        int psum = 0;
        saveNum = new int[nums.length + 1];
        saveNum[0] = 0;
        psumArr = new long[nums.length + 1];
        psumArr[0] = 0;

        for (int i = 1; i <= nums.length; i++) {
            saveNum[i] = nums[i-1];
            psumArr[i] = psumArr[i - 1] + saveNum[i];
        }

        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] > psum + nums[i-1]){

            }
            psum = max(nums[i], 0);
            ret = max(psum, ret);
        }

        answer = (int)maxSum(1, nums.length);
        return answer;
    }

    public static long maxSum(int i, int j){
        int minIdx = j;
        for (int k = i; k < j; k++) {
            if (saveNum[minIdx] > saveNum[k]){
                minIdx = k;
            }

            long sum = (psumArr[j] - psumArr[i-1]) * saveNum[minIdx];
            if (result < sum){
                result = sum;
            }

            if (i <= (minIdx - 1)){
                maxSum(i, minIdx - 1);
            }

            if ((minIdx + 1) <= j){
                maxSum(minIdx + 1, j);
            }
        }

        return result;
    }
}