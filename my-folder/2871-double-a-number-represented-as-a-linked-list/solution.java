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
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        ListNode after=head;
        while(curr!=null)
        {
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    public static void print(ListNode head)
    {
        while(head!=null)
        {
            System.out.print(head.val+" \t");
            head=head.next;
        }
        System.out.println();
    }
    public ListNode doubleIt(ListNode head) {
        print(head);
        //print(reverse(head));
        ListNode rev=reverse(head);
        print(rev);
        ListNode temp=rev;
        int carry=0;
        ListNode pre=null;
        while(temp!=null)
        {
            int value=temp.val*2;
            System.out.println(value);
            if(value/10==0)
                temp.val=value;
                
            else
                temp.val=value%10;

            if(carry!=0)
            {
                 temp.val=temp.val+1;
                 carry=0;
            }

            if(value/10!=0)
                carry=value/10;
            pre=temp;
            temp=temp.next;
        }
        if(carry!=0)
            pre.next=new ListNode(1);
        
        //print(rev);
        return reverse(rev);
    }
}
