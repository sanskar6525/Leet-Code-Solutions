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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        if(root==null)
            return res;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty())
        {
            double r=0.0;
            double sum=0.0;
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                TreeNode temp=q.poll();
                sum=sum+temp.val;
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
                
            }
            r=sum/s;
            res.add(r);
        }
        return res;
    }
}
