class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode ans = new ListNode(-1);
        ListNode curr = ans;
        
        int carry = 0;
        
        while(p != null || q != null || carry != 0){
            int v1 = (p != null) ? p.val : 0;
            int v2 = (q != null) ? q.val : 0;
            int sum = v1 + v2 + carry;
            
            ListNode node = new ListNode();
            node.val = sum % 10;
            carry = sum / 10;
            curr.next = node;
            curr = curr.next;
            
            if(p != null)
                p = p.next;
            if(q != null)
                q = q.next;
            
            
        } 
        
        return ans.next;
    }
}