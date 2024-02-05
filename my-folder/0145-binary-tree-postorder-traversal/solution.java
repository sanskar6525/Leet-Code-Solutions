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
public static void postorderTraversal(List<Integer> L,TreeNode r)
    {
        if(r==null)
            return;
        if(r.left!=null)
            postorderTraversal(L,r.left);
        if(r.right!=null)
            postorderTraversal(L,r.right);      
        L.add(r.val);
        
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null)
            return res;
        postorderTraversal(res,root);
        return res;
    }
}
