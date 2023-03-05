/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> levels = new PriorityQueue<>((a,b) -> Long.compare(b,a));
        LinkedList<TreeNode> level = new LinkedList<>();
        level.add(root);
        while (level.size() != 0) {
            long sum = 0;
            long size = level.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = level.poll();
                if (cur.left != null) {
                    level.offer(cur.left);
                }
                if (cur.right != null) {
                    level.offer(cur.right);
                }
                sum += cur.val;
            }
            levels.add(sum); 
        }
        if (levels.size() < k) {
            return -1;
        }
        for (int i = 0; i < k - 1; i++){
            levels.poll();
        }
        return levels.poll();
    }
}