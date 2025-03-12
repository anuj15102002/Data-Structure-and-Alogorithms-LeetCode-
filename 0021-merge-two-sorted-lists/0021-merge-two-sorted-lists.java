/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        // other node to traverse the result and adding the nodes to it
        ListNode ptr = result;

        while (list1 != null && list2 != null) {
            //checking which is smaller and adding to the resultant list
            if(list1.val<list2.val)
            {
                ptr.next=list1;
                list1=list1.next;
            }
            else 
            {
                ptr.next=list2;
                list2=list2.next;
           }
           ptr=ptr.next;

        }

        //if there are reamining nodes in the list then we add them 
        //to the resultant list or APPEND THE REMAINING LIST

        if(list1==null)
        {
            ptr.next=list2;
        }
        else if(list2==null)
        {
            ptr.next=list1;
        }
        return result.next;

    }
}