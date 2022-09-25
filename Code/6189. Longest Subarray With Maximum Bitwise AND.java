class Solution {
    public int longestSubarray(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int count = 0;
        int maxC = 0;
        for (int num : nums) {
            if (num == max) {
                count++;
            } else {
                count = 0;
            }
            maxC = Math.max(maxC, count);
        }
        return maxC;
    }
}