/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode temp=new ListNode(head.val);
        //temp.next=head.next;
        //result.next=head.next;
        //System.out.println(.next.val);
        ListNode curr=head.next;
        while(curr!=null)
        {
            ListNode r=new ListNode(curr.val);
            r.next=temp;
            temp=r;
            curr=curr.next;
        }
        return temp;
        
    }
}
