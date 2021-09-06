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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode d = new ListNode(-1, list1);
        ListNode am = list1, bp = list2, t = list1;
        int f = b-a;
        while(a-- > 1) {
            t = t.next;
        }
        am = t;
        t = t.next;
        am.next = list2;
        // t = list1;
        while(f-- > 0) {
            t = t.next;
        }
        while(bp.next != null) bp = bp.next;
        
        bp.next = t.next;
        
        return d.next;
    }
}