import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

class Solution {
    public long[] distance(int[] nums) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (!map.containsKey(num)) {
                map.put(num, new ArrayList<>());
            }
            map.get(num).add(i);
        }
        long[] ans = new long[n];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            long cur = 0; 
            for (Integer index : map.get(num)) {
                cur += Math.abs(index - i);
            }
            ans[i] = cur;
        }
        return ans;
    }
}