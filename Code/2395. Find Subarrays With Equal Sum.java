import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean findSubarrays(int[] nums) {
      if (nums.length == 2) {
        return false;
      }
      Set<Integer> set = new HashSet<>();
      int n = nums.length;
      for (int i = 0; i < n - 1; i++) {
        int cur = nums[i] + nums[i + 1];
        if (!set.add(cur)) {
          return true;
        }
      }
      return false;
  }
}