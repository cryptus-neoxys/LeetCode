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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode f = head;
        ListNode s = head;
        
        while(n-- > 0) f = f.next;
        
        if(f == null) {
            head = head.next;
            return head;
        }
        
        while(f.next != null) {
            f = f.next;
            s = s.next;
        }
        
        s.next = s.next.next;
        
        return head;
    }
}