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
    public ListNode rev(ListNode head, ListNode tail) {
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != tail) {
            ListNode forw = curr.next;
            
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        
        return prev;
    }
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return head;
        
        ListNode prev = null, curr = head;
        
        while(left > 1) {
            prev = curr;
            curr = curr.next;
            left--; right--;
        }
        
        ListNode h = prev, tail = curr;
        
        while(right-- > 0) {
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        
        
        if(h != null) h.next = prev;
        else head = prev;
        
        tail.next = curr;
        
        return head;
    }
}