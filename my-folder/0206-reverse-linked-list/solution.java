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
        ListNode curr=head;
        ListNode pre=null;
        ListNode post=null;
        while(curr.next!=null)
        {
            post=curr.next;
            curr.next=pre;
            pre=curr;
            curr=post;
        }
        curr.next=pre;
        head=curr;
        return head;
    }
}
