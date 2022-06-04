class Solution {
    
    public ListNode merge2sorted(ListNode l1, ListNode l2) {
     if(l1 == null || l2 == null){
         return l1 == null ? l2 : l1;
     }   
        
        ListNode head = new ListNode(-1);
        ListNode prev = head;
        
        ListNode c1 = l1;
        ListNode c2 = l2;
        
        while(c1 != null && c2 != null){
            if(c1.val <= c2.val){
                prev.next = c1;
                prev = c1;
                c1 = c1.next;
            }
            else{
                prev.next = c2;
                prev = c2;
                c2 = c2.next;
            }
        }
        if(c1 != null){
            prev.next = c1;
        }
        if(c2 != null){
            prev.next = c2;
        }
        return head.next;
    }
    
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
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode mid = middle(head);
        ListNode nH = mid.next;
        mid.next = null;
        
        head = sortList(head);
        nH = sortList(nH);
        
        return merge2sorted(head, nH);
    }
}