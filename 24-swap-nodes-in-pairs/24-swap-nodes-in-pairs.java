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
        
        ListNode dummy = new ListNode(-1, head), pre = dummy;
        
        while(head != null  && head.next != null) {
            ListNode next = head.next;
            head.next = next.next;
            next.next = head;
            pre.next = next;
            pre = head;
            head = head.next;
        }
        
        return dummy.next;
    }
}