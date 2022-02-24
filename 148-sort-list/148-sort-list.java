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
    
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(-1);
        ListNode dummy = h;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }
        
        while(l1 != null) {
            dummy.next = l1;
            l1 = l1.next;
            dummy = dummy.next;
        }
        while(l2 != null) {
            dummy.next = l2;
            l2 = l2.next;
            dummy = dummy.next;
        }
        return h.next;
    }
    
    private ListNode middle(ListNode head) {
        ListNode slow = null, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow == null ? head : slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;
    }
    
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode mid = this.middle(head);
        ListNode l = sortList(head);
        ListNode r = sortList(mid);
        return merge(l, r);
    }
}