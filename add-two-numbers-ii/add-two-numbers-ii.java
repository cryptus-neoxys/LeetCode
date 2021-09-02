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
    public ListNode rev(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null) {
            ListNode forw = curr.next;
            
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 != null)
            return l2;
        else if(l1 != null && l2  == null)
            return l1;
        if(l1 == null && l2 == null)
            return l1;
        l1 = rev(l1);
        l2 = rev(l2);
        
        ListNode res = new ListNode(0);
        ListNode tmp = res;
        // DEBUG
        // while(l2 != null) {
        //     System.out.println(l2.val); l2 = l2.next;
        // }
        
        int c = 0, sum = 0;
        
        while(l1 != null || l2 != null) {
            sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + c;
            
            c = sum / 10;
            
            tmp.next = new ListNode(sum % 10);
            tmp = tmp.next;
            System.out.println(c + " " + sum%10);
            
            l1 = l1 != null ? l1.next : l1; l2 = l2 != null ? l2.next : l2;
        }
        // while(res != null) {
        //     System.out.println(res.val); res = res.next;
        // }
        
        if(c != 0) tmp.next = new ListNode(c);
        
        return rev(res.next);
    }
}