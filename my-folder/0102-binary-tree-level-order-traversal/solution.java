
class Solution {
   public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> seen = new LinkedList<>();
        
        if(root == null) return res;
        
        seen.offer(root);
        while(!seen.isEmpty()){
            int numLevel = seen.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i < numLevel; i++){
                TreeNode currentNode = seen.poll();
                level.add(currentNode.val);
                if(currentNode.left != null) seen.add(currentNode.left);
                if(currentNode.right != null) seen.add(currentNode.right);
            }
            res.add(level);
        }        
        
        return res;
    }
}
