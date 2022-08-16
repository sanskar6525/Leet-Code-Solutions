class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode act = head;
        ListNode res = head;
        int nodes = 0;
        while (act.next != null){
            act = act.next;
            nodes++;
        }
        int mid = nodes / 2;
        if (nodes % 2 != 0){
            while(mid >= 0){
            res = res.next;
            mid--;
           }
        }
        else {
            while(mid > 0){
            res = res.next;
            mid--;
          }
        }
        return res;    
    }
}
