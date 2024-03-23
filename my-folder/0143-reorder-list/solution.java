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
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev=null, after=null;
        while(slow!=null)
        {
            after=slow.next;
            slow.next=prev;
            prev=slow;
            slow=after;
        }
        ListNode firstHalf = head;
        ListNode secondHalf = prev;
        while (secondHalf.next != null) {
            after= firstHalf.next;
            prev = secondHalf.next;
            
            firstHalf.next = secondHalf;
            secondHalf.next = after;
            
            firstHalf = after;
            secondHalf = prev;
        }
    }
}
