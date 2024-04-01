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
    public static void Invert(TreeNode r)
    {
        if(r==null||(r.left==null && r.right==null))
            return;
        TreeNode temp=r.right;
        r.right=r.left;
        r.left=temp;
        Invert(r.left);
        Invert(r.right);
    }
    public TreeNode invertTree(TreeNode root) {
        Invert(root);
        return root;
        
    }
}
