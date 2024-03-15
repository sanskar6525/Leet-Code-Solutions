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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null)
            return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int level=q.size();
            TreeNode curr=new TreeNode();
            for(int i=0;i<level;i++)
            {
                curr=q.poll();
                if(curr.left!=null)
                    q.offer(curr.left);
                if(curr.right!=null)
                    q.offer(curr.right);
            }
            res.add(curr.val);
        }
        return res;
    }
}
