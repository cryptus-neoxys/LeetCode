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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode d = new ListNode(-1, head),
            pre = d,
            p = head,
            c = p.next;
        
        while(c != null) {
            ListNode forw = c.next;
            p.next = forw;
            c.next = p;
            pre.next = c;
            
            pre = p;
            p = forw;
            if(forw != null)c = forw.next; else c = null;
        }
        
        return d.next;
    }
}