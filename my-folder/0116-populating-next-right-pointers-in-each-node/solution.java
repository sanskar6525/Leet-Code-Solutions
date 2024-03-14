/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)
            return root;
        Queue<Node> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty())
        {
            int level=q.size();

            for(int i=0;i<level;i++)
            {
                Node point=q.poll();
                if(point.left!=null)
                    q.offer(point.left);
                if(point.right!=null)
                    q.offer(point.right);
                if(i!=level-1)
                    point.next=q.peek();
            }
        }
        return root;
    }
}
