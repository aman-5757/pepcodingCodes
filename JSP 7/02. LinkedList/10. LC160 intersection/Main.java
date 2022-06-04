public class Solution {
    public int size(ListNode head){
    
        ListNode curr = head;
        int s = 0;
        while(curr != null)
        {
            s++;
            curr = curr.next;
        }
        return s;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        int sA = size(headA);
        int sB = size(headB);
        int d = Math.abs(sA - sB);
        
        
        
        ListNode p1 = headA;
        ListNode p2 = headB;
        
        
        if(sA > sB){
            while(d-- > 0){
                p1 = p1.next;
            }
        }
        else{
            while(d-- > 0){
                p2 = p2.next;
            }
        }
        
        while(p1 != null && p2 != null){
            if(p1 == p2){
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
            
        }
        return null;
        
    }
}