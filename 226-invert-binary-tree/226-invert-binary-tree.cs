/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public TreeNode InvertTree(TreeNode root) {
        return InvertTreeHelper(root, root);
    }
    
    private TreeNode InvertTreeHelper(TreeNode node, TreeNode root) {
        if (node == null) return root;
        
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        InvertTreeHelper(node.left, root);
        return InvertTreeHelper(node.right, root);
    }
}