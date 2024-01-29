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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)
            return head;
        
        //Create a new Linked List by creating a new head;
        ListNode res=new ListNode(head.val);
        //System.out.println(head.next.next.val);
        ListNode temp1=head.next.next;
        ListNode temp2=res;

        //Loop to add the odd places elements
        while(temp1!=null)
        {
            ListNode t=new ListNode(temp1.val);
             System.out.println(temp1.val);
            temp2.next=t;
            temp2=t;
            if(temp1.next==null)
                break;
            temp1=temp1.next.next;
        }
        temp1=head.next;

        //Loop to add the even places elements
        while(temp1!=null)
        {
            ListNode t=new ListNode(temp1.val);
            temp2.next=t;
            temp2=t;
            if(temp1.next==null)
                break;
            temp1=temp1.next.next;
        }
        return res;
    }
}
