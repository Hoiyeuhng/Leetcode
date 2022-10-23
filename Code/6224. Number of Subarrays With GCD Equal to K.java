class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == k) {
                ans++;
            }
            int cur = nums[i];
            for (int j = i + 1; j < n; j++) {
                cur = gcd(cur, nums[j]);
                if (cur == k) {
                    ans++;
                }
            }
        }
        return ans;

    }
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}