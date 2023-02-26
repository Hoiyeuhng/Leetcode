
class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];
        int n = nums.length;
        for (int i = 1; i < n; i ++){
            l[i] = l[i - 1] + nums[i - 1];
            
        }
        for (int i = n - 2; i >= 0; i--) {
            r[i] = r[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(l[i] - r[i]);
        }
        return ans;
    }
}