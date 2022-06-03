public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
        // head = head.next;
        // return head;
        
        return head.next;
    }