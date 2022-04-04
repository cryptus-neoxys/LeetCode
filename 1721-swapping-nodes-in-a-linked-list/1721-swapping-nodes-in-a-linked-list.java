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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode p1 = null, p2 = null;
        for(ListNode p = head; p != null; p = p.next) {
            p2 = p2 == null ? null : p2.next;
            if(--k == 0) {
                p1 = p;
                p2 = head;
            }
        }
        
        int t = p1.val;
        p1.val = p2.val;
        p2.val = t;
        return head;        
    }
}