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
        if(k== 0 || head == null || head.next == null){
            return head;
        }
        int len = length(head);
        ListNode oh = null;
        ListNode ot = null;
        ListNode curr = head;
        
        while(len >= k){
            int tmp = k;
            while(tmp-- > 0){
                ListNode save = curr.next;
                curr.next = null;
                addFirst(curr);
                curr = save;
            }
            if(oh == null){
                oh = th;
                ot = tt;
            }
            else{
                ot.next = th;
                ot = tt;
            }
            th = null;
            tt = null;
            
            len -= k;
        }
        
        ot.next = curr;
        // head = oh;
        // return head;
        return oh;
    }
}