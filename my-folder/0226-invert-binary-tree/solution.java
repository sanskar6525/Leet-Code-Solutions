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
    public static void invert(TreeNode r)
    {
        if(r==null)
            return;
        if(r.left==null && r.right==null)
            return;

        TreeNode right=r.right;
        r.right=r.left;
        r.left=right;
        invert(r.left);
        invert(r.right);
    }
    public TreeNode invertTree(TreeNode root) {
        invert(root);

        return root;
    }
}  
