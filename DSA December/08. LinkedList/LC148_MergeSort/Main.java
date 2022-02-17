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
    
    //merge 2 sorted list
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //chck edge case
        if(list1 == null || list2 == null)
            return list1 == null ? list2 : list1;
        
        
        ListNode head = new ListNode(-1);
        ListNode prev = head;
        
        
        ListNode one = list1;
        ListNode two = list2;
        
        while(one != null && two != null){
            if(one.val < two.val){
                prev.next = one;
                prev = one;
                one = one.next;
            }
            else{
                prev.next = two;
                prev = two;
                two = two.next;
            }
        }
        if(one != null){
            prev.next = one;
        }
        if(two != null){
            prev.next = two;
        }
        
        return head.next;
    
        
        
    }
    
    //mid
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
    
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null ){
            return head;
        }
        //step 1
        ListNode mid = middleNode(head);
        ListNode nH = mid.next;
        mid.next = null;
        
        //step 2 -- faith
        head = sortList(head);
        nH = sortList(nH);
        
        return mergeTwoLists(head, nH);
    }
}