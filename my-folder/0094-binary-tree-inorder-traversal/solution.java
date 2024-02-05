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
    public static void inorderTraversal(List<Integer> L,TreeNode r)
    {
        if(r==null)
            return;
        if(r.left!=null)
            inorderTraversal(L,r.left);
        L.add(r.val);
        if(r.right!=null)
            inorderTraversal(L,r.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null)
            return res;
        inorderTraversal(res,root);
        return res;
    }
}
