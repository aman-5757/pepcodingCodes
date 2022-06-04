class Solution {
    public ListNode midNode(ListNode node) {
        if (node == null || node.next == null)
            return node;

        ListNode slow = node, fast = node;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
        
        public ListNode reverseList(ListNode head) {
        if(head == null)    return null;
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode save = curr.next;
            curr.next = prev;
            prev = curr;
            curr = save;
        }
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        
        if(head == null)    return  true;
        ListNode mid = midNode(head);
        ListNode head_2 = mid.next;
        head_2 = reverseList(head_2);
        mid.next = null;
        ListNode i = head;
        ListNode j = head_2; 
        boolean ans = true;
        while(i != null && j != null){
            if(i.val != j.val){
                ans = false;
                break;
            }
            i = i.next;
            j = j.next;
        }
        
        return ans;
    }
}