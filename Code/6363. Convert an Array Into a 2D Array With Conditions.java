import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Integer key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        for (int i = 0; i < max; i++) {
            List<Integer> cur = new LinkedList<>();
            for (Integer key : map.keySet()) {
                if (map.get(key) == 0) {
                    continue;
                }
                cur.add(key);
                map.put(key, map.get(key) - 1);
            }
            ans.add(new LinkedList<>(cur));
        }
        
        return ans;
    }
}