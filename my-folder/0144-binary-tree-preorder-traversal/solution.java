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
    public static void preorderTraversal(List<Integer> L,TreeNode r)
    {
        if(r==null)
            return;
        L.add(r.val);
        if(r.left!=null)
            preorderTraversal(L,r.left);
        if(r.right!=null)
            preorderTraversal(L,r.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        preorderTraversal(res,root);
        
        return res;
        
    }
}
