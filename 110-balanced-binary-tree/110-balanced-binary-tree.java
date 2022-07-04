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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = isBalancedHelper(root.left);
        int right = isBalancedHelper(root.right);
        return Math.abs(left - right) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }
    private int isBalancedHelper(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(isBalancedHelper(node.left), isBalancedHelper(node.right));
    }
}