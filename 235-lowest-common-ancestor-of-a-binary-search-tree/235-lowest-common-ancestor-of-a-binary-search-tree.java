/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode common = root;
        TreeNode pPtr = root;
        TreeNode qPtr = root;
        
        while (pPtr != p && qPtr != q) {
            if (pPtr.val < p.val) {
                pPtr = pPtr.right;
            }
            else if (pPtr.val > p.val) {
                pPtr = pPtr.left;
            }
            if (qPtr.val < q.val) {
                qPtr = qPtr.right;
            }
            else if (qPtr.val > q.val) {
                qPtr = qPtr.left;
            }
            if (pPtr == qPtr) common = pPtr;
        }
        
        return common;
    }
}