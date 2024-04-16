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
    public static void add(int curr,int v,int d,Queue<TreeNode> q)
    {
        TreeNode t=q.remove();
        if(curr==d-1)
        {
            if(t.left!=null)
            {
                TreeNode temp=t.left;
                t.left=new TreeNode(v);
                t.left.left=temp;
            }
            else
                t.left=new TreeNode(v);
            if(t.right!=null)
            {
                TreeNode temp=t.right;
                t.right=new TreeNode(v);
                t.right.right=temp;
            }
            else
                t.right=new TreeNode(v);
            return;
        }
        

        else
        {
            if(t.left!=null)
            {
                q.add(t.left);
                add(curr+1,v,d,q);
            }
            if(t.right!=null)
            {
                q.add(t.right);
                add(curr+1,v,d,q);
            }
        }

    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root==null)
            return root;
        Queue<TreeNode> q=new LinkedList<>();
        if(depth!=1)
        {
            int currLevel=1;
            q.add(root);
            add(currLevel,val,depth,q);
        }
        else
        {
            TreeNode te=new TreeNode(val);
            TreeNode s=root;
            te.left=s;
            root=te;
        }
        
        return root;
    }
}
