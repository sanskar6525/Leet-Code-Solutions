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
    public boolean same(TreeNode s,TreeNode t)
    {
        if(s==null && t==null)
            return true;
        if(s==null && t!=null)
            return false;
        if(s!=null && t==null)
            return false;
        if(s.val==t.val)
        {
            boolean res1=same(s.left,t.left);
            boolean res2=same(s.right,t.right);
            if(res1==true && res2==true)
                return true;
        }
        return false;
        
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return same(p,q);
        
    }
}
