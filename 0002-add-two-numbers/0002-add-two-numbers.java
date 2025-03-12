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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // we take result LinkedList
        ListNode result = new ListNode(0);
        // this ptr will point at the first node of result

        // take carry variable
        int carry = 0;
        ListNode ptr = result;

        while (l1 != null || l2 != null) {
            int sum = carry; // start the sum with carry

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            sum = sum % 10;

            // will place this sum to the result linked list
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }
        // check if carry left out then we placed it at the end
        if (carry == 1)
            ptr.next = new ListNode(1);

        return result.next;

    }
}