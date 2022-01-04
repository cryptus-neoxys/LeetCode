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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head==null || head.next ==null || k==1)
            return head;
        ListNode D = new ListNode(-1);
        D.next = head;
        ListNode start = D;
        int i=0;
        while(head != null) {
            i++;
            if(i % k == 0) {
                start = reverse(start, head.next);
                head = start.next;
            } else head = head.next;
        }
        return D.next;
    }
    
    private ListNode reverse(ListNode start, ListNode end) {
        ListNode curr = start.next;
        ListNode next;
        ListNode prev = start;
        ListNode first = curr;
        while(curr != end) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        start.next = prev;
        first.next = curr;
        return first;
    }
}