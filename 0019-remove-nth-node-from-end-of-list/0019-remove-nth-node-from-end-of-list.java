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
    
   
    public ListNode removeNthFromEnd(ListNode head, int n) {
            //we have to solve this problem in one iteration 

            ListNode dummy=new ListNode(0);
            dummy.next=head;

            //to create a window of size n
            ListNode first=dummy;
            ListNode second=dummy;

            for(int i=0;i<n;i++)
            {
                second=second.next;
            }

            while(second.next!=null)
            {
                first=first.next;
                second=second.next;
            }
            first.next=first.next.next;
            return dummy.next;
        
        
        
    }
}