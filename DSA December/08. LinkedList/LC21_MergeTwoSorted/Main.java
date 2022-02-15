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
}