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
    int diameter=0;
    public int height(TreeNode r)
    {
        if(r==null)
            return 0;
        int h1=height(r.left);
        int h2=height(r.right);
        int dia=h1+h2+1;
        diameter=Math.max(dia,diameter);
        return 1+Math.max(h1,h2);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1;
        
    }
}
