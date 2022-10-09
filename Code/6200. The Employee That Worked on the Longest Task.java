class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int time = -1;
        int pre = 0;
        int ans = n;
        for (int[] log : logs) {
            int cur = log[1] - pre;
            if (cur > time) {
                time = cur;
                ans = log[0];
            } else if (cur == time) {
                time = cur;
                ans = Math.min(log[0], ans);
            }
            pre = log[1];

        }
        return ans;
    }
}