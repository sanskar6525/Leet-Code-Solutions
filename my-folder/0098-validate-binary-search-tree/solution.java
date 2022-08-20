class Solution {
    class BSTpair{
        long min;
        long max;
        boolean isBST;
    }
    public boolean isValidBST(TreeNode root) {
        BSTpair p = check(root);
        return p.isBST;
    }
    
    public BSTpair check(TreeNode root){
        if(root == null){
            BSTpair bp = new BSTpair();
            bp.min = Long.MAX_VALUE;
            bp.max = Long.MIN_VALUE;
            bp.isBST = true;
            return bp;
        }
        BSTpair lp = check(root.left);
        BSTpair rp = check(root.right);
        
        BSTpair mp = new BSTpair();
        mp.min = Math.min(root.val, Math.min(lp.min, rp.min));
        mp.max = Math.max(root.val, Math.max(lp.max, rp.max));
        mp.isBST = lp.isBST && rp.isBST && root.val > lp.max && root.val < rp.min;
        return mp;
    }
}
