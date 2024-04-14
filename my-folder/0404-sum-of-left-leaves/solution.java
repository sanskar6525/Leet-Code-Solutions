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
    public static int sumOfLeftLeaves(TreeNode root) {
        if(root==null || (root.left==null && root.right==null))
            return 0;
        
        int sum=0;
        Queue<TreeNode> q=new LinkedList<>();
        if(root.left!=null)
        {
            TreeNode r=root.left;
            q.add(r);
            if(r.left==null && r.right==null)
                sum=sum+root.left.val;
            //System.out.println(root.left.val+" Sum= "+ sum);
        }
           
        if(root.right!=null)
            q.add(root.right);
       
      
        return sum(q,sum);
    }

    public static int sum(Queue<TreeNode> q,int s)
    {
        if(q.isEmpty())
            return s;
        TreeNode temp=q.remove();
        if(temp.left!=null)
        {
            TreeNode f=temp.left;
            q.add(f);

            if(f.left==null && f.right==null)
                s=s+f.val;
            //System.out.println(temp.left.val+" Sum= "+ s);
        }
           
        if(temp.right!=null)
            q.add(temp.right);

        return sum(q,s);

    }
}
