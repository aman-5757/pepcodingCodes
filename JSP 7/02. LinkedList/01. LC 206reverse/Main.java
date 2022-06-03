class Solution {
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
}