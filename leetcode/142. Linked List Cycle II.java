/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head, fast=head;
        
        boolean hascycle=false;
        
        while(fast !=null && fast.next != null)
        {
            fast=fast.next.next;
            slow=slow.next;
            
            if(fast == slow)
            {
                hascycle=true;
                break;
            }
        }
        
        if(!hascycle) return null;
        
        ListNode curr=head;
        
        while(curr != slow)
        {
            curr=curr.next;
            slow=slow.next;
        }
        
        return slow;
        
    }
}