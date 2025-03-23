class LRUCache {
    class Node
    {
        int key;
        int val;
        Node next;
        Node prev;

        Node()
        {
            next=null;
            prev=null;
        }
        Node(int key,int val)
        {
            this.key=key;
            this.val=val;
        }
    }

    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);
    int cap;
    HashMap<Integer,Node> map=new HashMap<>();
        

    private void addAfterHead(Node newNode)
    {
        Node temp=head.next;
        newNode.next=temp;
        newNode.prev=head;

        head.next=newNode;
        temp.prev=newNode;
    }

    private void deleteNode(Node newNode)
    {
        Node prevNode=newNode.prev;
        Node nextNode=newNode.next;

        prevNode.next=nextNode;
        nextNode.prev=prevNode;
    }


    public LRUCache(int capacity) {
        this.cap=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        {
            Node resNode=map.get(key);
            int ans=resNode.val;

            map.remove(key);
            deleteNode(resNode);
            addAfterHead(resNode);

            map.put(key,head.next);
            return ans;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            Node curr=map.get(key);
            map.remove(key);
            deleteNode(curr);
        }

        if(map.size()==cap)
        {
            map.remove(tail.prev.key);
            deleteNode(tail.prev);
        }

        addAfterHead(new Node(key,value));
        map.put(key,head.next);
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */