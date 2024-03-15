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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        List<Integer> level = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        {
            while(!q.isEmpty())
            {
                if(!level.isEmpty()) level.clear();
                int qSize = q.size();
                for(int i = 0; i < qSize; i++)
                {
                    TreeNode n = q.poll();
                    if(n.left != null && n.right != null)
                        if((n.left.val == x && n.right.val == y) || (n.left.val == y && n.right.val == x))
                            return false;

                    level.add(n.val);
                    if(n.left != null) q.add(n.left);
                    if(n.right != null) q.add(n.right);
                }
                if(level.contains(x) && level.contains(y))
                    return true;
            }

            return false;
        }
    }
}
