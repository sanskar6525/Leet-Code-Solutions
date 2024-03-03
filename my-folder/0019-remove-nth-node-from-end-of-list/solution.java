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
    public static int size(ListNode head)
    {
        int c=0;
        ListNode temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return head;
        int s=size(head);
        if(n==s)
            return head.next;
        int rep=s-n;
        ListNode temp=head;
        for(int i=1;i<rep;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        //System.out.println(size(head));
        
        return head;
    }
}
