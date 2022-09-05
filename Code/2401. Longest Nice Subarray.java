class Solution {
    public int longestNiceSubarray(int[] nums) {
		int max = 1;
		int left = -1;
		for (int i = 1; i < nums.length; i++) {
			for (int j = i - 1; j >= left && j >= 0; j--) {
				if ((nums[i] & nums[j] )!= 0) {
					left = j;
					break;
				}
			}
			max = Math.max(max, i - left);
		}
        return max;
    }
}
