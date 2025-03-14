/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head==null)return null;

        // I STEP: to make the new node with same value as previous node
        // and insert it between the two nodes
        // make copy where random is null and insert it between the
        // original copy 
        
        Node curr=head;
        while(curr!=null)
        {
            Node newNode=new Node(curr.val);
            newNode.next=curr.next;
            curr.next=newNode;
            curr=newNode.next;
        }


        //II STEP: to copy random node whom they are pointing 
        curr=head;
        while(curr!=null)
        {
            if(curr.random!=null)
            {
                curr.next.random=curr.random.next;
            }
            curr=curr.next.next;
        }

        curr=head;
        Node newHead=head.next;
        Node newCurr=newHead;
        
        // III STEP: to separate the orignal LL and copied LL
        while(curr!=null)
        {
            curr.next=newCurr.next;
            curr=curr.next;
            if(curr!=null)
            {
                newCurr.next=curr.next;
                newCurr=newCurr.next;
            }

        }

        // return the head of copied LL
        return newHead;        
    }
}