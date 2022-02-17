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
    
    public static ListNode th = null;
    public static ListNode tt = null;
    
    public int size(ListNode head){
        ListNode curr = head;
        int len = 0;
        while(curr != null){
            curr = curr.next;
            len++;
        }
        return len;
    } 
    public void addFirst(ListNode node){
        if(th == null){
            th = node;
            tt = node;
        }
        else{
            node.next = th;
            th = node;
        }
    }
    
    
    
    public ListNode reverseKGroup(ListNode head, int k) {
        int len = size(head);
        ListNode oh = null;
        ListNode ot = null;
        ListNode curr = head;
        
        
        while(len >= k){
            for(int i = 0; i<k; i++){
                ListNode forw = curr.next;
                
                //remove & add
                curr.next = null;
                addFirst(curr);
                curr = forw;
            } 
            if(oh == null){
                //first time add
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
        return oh;
    }
}