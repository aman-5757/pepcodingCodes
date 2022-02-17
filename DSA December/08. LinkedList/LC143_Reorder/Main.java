/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    //mid -- left
    public ListNode middleNode(ListNode head) {
        if(head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null &&  fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    
    //reverse
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null){
            //link reverse
            ListNode forw = curr.next;
            curr.next = prev;
            
            //update
            prev = curr;
            curr = forw;
            
        }
        return prev;
        
    }
    
    
    public void reorderList(ListNode head) {
        if(head == null || head.next == null ){
            return;
        }
        //step 1
        ListNode mid = middleNode(head);
        ListNode nH = mid.next;
        mid.next = null;
        
        //step 2
        nH = reverseList(nH);
        
        //step 3
        ListNode c1 = head;
        ListNode c2 = nH;
        
        while(c1 != null && c2 != null){
            ListNode s1 = c1.next;
            ListNode s2 = c2.next;
            c1.next = c2;
            c2.next = s1;
            c1 = s1;
            c2 = s2;
        }
        
        
        
    }
}