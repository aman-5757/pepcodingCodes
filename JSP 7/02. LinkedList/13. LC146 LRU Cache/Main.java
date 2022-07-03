class LRUCache {
    
    public class Node{
        int key;
        int val;
        Node next;
        Node prev;
    }

    Node head;
    Node tail;
    int cap;
    HashMap<Integer, Node> hm;

    public LRUCache(int capacity) {
        head = new Node();
        tail = new Node();

        head.next = tail;
        tail.prev = head;

        cap = capacity;
        hm = new HashMap<>();
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
            Node temp = hm.get(key);
            extract(temp);
            addBeforeTail(temp);
            return temp.val;
        }
        else{
            return -1;
        }

    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            //update
            Node temp = hm.get(key);
            temp.val = value;
            extract(temp);
            addBeforeTail(temp);
        }
        else{
            //new add
            if(hm.size() == cap){
                Node temp = head.next;  //lru
                extract(temp);
                hm.remove(temp.key);
            }

            Node curr = new Node();
            curr.key = key;
            curr.val = value;
            addBeforeTail(curr);
            hm.put(key, curr);


        }
        
    }

    public void addBeforeTail(Node temp){
        Node tm1 = tail.prev;
        tm1.next = temp;
        temp.next = tail;
        tail.prev = temp;
        temp.prev = tm1;

    }

    public void extract(Node node){
        Node nm1 = node.prev;
        Node np1 = node.next;
        nm1.next = np1;
        np1.prev = nm1;
        node.next = null;
        node.prev = null;

    }
}