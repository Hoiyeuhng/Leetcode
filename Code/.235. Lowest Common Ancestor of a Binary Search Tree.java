class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q) {
            return root == p ? p : q;
        }
        if (p == null || q == null) {
            return p == null ? p : q;
        }
        
        TreeNode node = root;
        while (node != null) {
            if (node.val > p.val && node.val > q.val) {
                node = node.left;
            } else if (node.val < p.val && node.val < q.val) {
                node = node.right;
            } else {
                return node;
            }
        }
        return null;
        
    }
}