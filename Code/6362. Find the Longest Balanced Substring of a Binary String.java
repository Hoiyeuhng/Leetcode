class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1' && (i == n - 1 || s.charAt(i+1) != '1' )) {
                boolean meet = false;
                int cur = 0;
                int curmax = 0;
                for (int j = i; j >= 0; j--) {
                    if (s.charAt(j) == '1' && !meet) {
                        cur++;
                        curmax= Math.max(curmax, cur);
                    } else if (s.charAt(j) == '0' && cur > 0) {
                        meet = true;
                        cur--;
                    } else {
                        break;
                    }
                }
                ans = Math.max(ans,curmax - cur);
            }
        }
        return 2 * ans;
    }
}