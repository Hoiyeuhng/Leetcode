import java.util.Arrays;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i][0] = heights[i];
            nums[i][1] = i;
        }
        Arrays.sort(nums, (a,b) -> Integer.compare(b[0], a[0]));
        String[] ans = new String[n];
        int index = 0;
        for (int[] num : nums) {
            ans[index] = names[num[1]];
            index++;
        }
        return ans;
    }
}