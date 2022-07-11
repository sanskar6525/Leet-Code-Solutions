/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
       
        while(temp1!=null)
        {
            ListNode temp2=headB;
            while((temp2!=null))
            {
                if((temp1.next==temp2.next) || (temp1==temp2))
                {
                    if(temp1==temp2)
                    {
                        return temp1;
                    }
                    else
                    {
                        ListNode  t=temp1.next; 
                        return t;
                    }
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        return null;
    }
}
