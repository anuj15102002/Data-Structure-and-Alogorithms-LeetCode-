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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        //first we'll create a dummy listNode
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        //we'll create a currNode pointer to that will point to left indexed node 
        //and preNode pointer to point the previous node of currNode 

        ListNode preNode=dummy;
        ListNode currNode=head;

        //iterate to reached 3 indexed node
        for(int i=0;i<left-1;i++)
        {
            preNode=preNode.next;
            currNode=currNode.next;
        }

        //now we take two pointer to reverse that portion of linked list

        ListNode subCurr=currNode;
        ListNode vPre=null;

        for(int i=0;i<=right-left;i++)
        {
            
            ListNode nextNode=subCurr.next;
            subCurr.next=vPre;
            vPre=subCurr;
            subCurr=nextNode;
        
        }
       preNode.next=vPre;
       currNode.next=subCurr;

        return dummy.next;

    }
}