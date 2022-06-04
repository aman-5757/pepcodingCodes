class Solution {
    public ListNode middle(ListNode head ){
        if(head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null){
            //connections
            ListNode save = curr.next;
            curr.next = prev;
            
            //move--iterate
            prev = curr;
            curr = save;
        }
        head = prev;
        return head;
    }
    
    public void reorderList(ListNode head) {
        if(){
            
        }
        
        ListNode mid = middle(head);
        ListNode nH = mid.next;
        mid.next = null;
        
        reverseList(nH);
        
        ListNode c1 = head;
        ListNode c2 = nH;
        
        while(){
            
        }
        
    }
}