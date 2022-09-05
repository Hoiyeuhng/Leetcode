import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        cur.add(1);
        ans.add(new ArrayList<>(cur));
        if (numRows == 1) {
            return ans;
        }
        for (int i = 1; i < numRows; i++) {
            cur.clear();
            cur.add(1);
            List<Integer> last = ans.get(ans.size() - 1);
            for (int index = 1; index < i; index++) {
                cur.add(last.get(index - 1) + last.get(index));
            }
            cur.add(1);
            ans.add(new ArrayList<>(cur));
        }
        return ans;
        
    }
}