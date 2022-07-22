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
        ListNode now=head;
        ListNode pre=null;
        ListNode n=null;
        if((head!=null)&&(head.next!=null))
        {
            while(now.next!=null)
        {
            n=now.next;
            now.next=pre;
            pre=now;
            now=n;
        }
        now.next=pre;
        head=now;
        return head;
        }
        else
        {
           return head; 
        }
        
    }
}
