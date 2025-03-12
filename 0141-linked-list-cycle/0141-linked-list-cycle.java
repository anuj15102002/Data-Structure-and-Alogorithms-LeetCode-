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
    public boolean hasCycle(ListNode head) {

        //here we apply slow and fast pointer or rabbit & tortoise 
        //approach

        ListNode sp=head; //slow pointer
        ListNode fp=head; //fast pointer

        while(sp!=null && fp!=null && fp.next!=null)
        {
            sp=sp.next;
            fp=fp.next.next;

            //they meet when there is a cycle in a linked list
            if(sp==fp)
            {
                return true;
            }
        }
        return false;
        
    }
}