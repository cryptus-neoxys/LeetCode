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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        int s = 0;
        ListNode curr = head; head = head.next;
        while(head != null) {
            curr.next = head;
            if(head.val == 0) {
                head.val = s; s = 0;
                curr = head;
            } else {
                s += head.val;
            }
            head = head.next;
        }
        return dummy.next.next;
    }
}