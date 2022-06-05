class Solution {
    
    public int length(ListNode head){
        ListNode curr = head;
        int s =  0;
        while(curr !=  null){
            curr = curr.next;
            s++;
        }
        return s;
    }
    
    static ListNode th = null;
    static ListNode tt = null;
    
    public void addFirst(ListNode node){
        if(th == null ){
            th = node;
            tt = node;
        }
        else{
            node.next = th;
            th = node;
        }
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        
    }
}