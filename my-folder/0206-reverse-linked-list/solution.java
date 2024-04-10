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
        ListNode before=null;
        ListNode after;
        ListNode curr=head;
        while(curr!=null)
        {
            after=curr.next;
            curr.next=before;
            before=curr;
            curr=after;
        }
        head=before;
        return head;
    }
}
