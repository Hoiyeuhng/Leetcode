import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int cur = nums[i] + nums[l] + nums[r];
                if (cur == 0) {
                    ans.add(List.of(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                } else if (cur > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return ans;
        
    }
}