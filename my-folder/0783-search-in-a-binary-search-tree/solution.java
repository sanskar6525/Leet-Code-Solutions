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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
            return root;
        TreeNode temp=root;
        while(temp!=null)
        {
            if(temp.val==val)
                break;
            if(val<temp.val)
                temp=temp.left;
            else
                temp=temp.right;
        }
        return temp;
        
    }
}
