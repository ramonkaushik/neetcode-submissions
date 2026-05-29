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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null || dfs(root, subRoot)) return true;
        else if(root == null) return false;

        return isSubtree(root.right, subRoot) || isSubtree(root.left, subRoot);
    }

    private boolean dfs(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        else if(p == null || q == null || p.val != q.val) {
            return false;
        }

        return dfs(p.left, q.left) && dfs(p.right, q.right);

    }
}
