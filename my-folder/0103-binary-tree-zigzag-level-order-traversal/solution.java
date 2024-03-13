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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
            return res;
        Deque <TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean reverse=false;

        while(!q.isEmpty())
        {
            int level=q.size();
            List<Integer> l=new ArrayList<>(level);
            for(int i=0;i<level;i++)
            {
                if(!reverse)
                {
                    TreeNode temp=q.pollFirst();
                    l.add(temp.val);
                    if(temp.left!=null)
                        q.addLast(temp.left);
                    if(temp.right!=null)
                        q.addLast(temp.right);

                }
                else
                {
                    TreeNode temp=q.pollLast();
                    l.add(temp.val);
                    if(temp.right!=null)
                        q.addFirst(temp.right);
                    if(temp.left!=null)
                        q.addFirst(temp.left);
                }
            }
            reverse=!reverse;
            res.add(l);
        }
        return res;
    }
}
