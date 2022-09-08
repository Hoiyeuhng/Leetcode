import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

class Solution {
    public List<Integer> preorder(Node root) {
        if (root == null) {
            return List.of();
        }
        Deque<Node> stack = new ArrayDeque<>();
        stack.offer(root);
        List<Integer> ans = new ArrayList<>();
        while (!stack.isEmpty()) {
            Node cur = stack.pollLast();
            ans.add(cur.val);
            Collections.reverse(cur.children);
            if (cur.children != null) {
                for (Node c : cur.children) {
                    stack.offerLast(c);
                }
            }
            
        }
        return ans;
    }
}
