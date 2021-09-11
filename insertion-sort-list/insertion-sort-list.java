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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(ListNode h = head; h != null; h = h.next) {
            arr.add(h.val);
        }
        
        Collections.sort(arr);
        int i = 0;
        for(ListNode h = head; h != null; h = h.next) {
            h.val = arr.get(i); i++;
        }
        
        return head;
    }
}