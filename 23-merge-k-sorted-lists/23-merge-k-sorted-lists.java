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
    
    // mergeList
    private ListNode mergeLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode dummyHead = new ListNode(-1);
        head.next = dummyHead;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                dummyHead.next = l1;
                l1 = l1.next;
            } else {
                dummyHead.next = l2;
                l2 = l2.next;
            }
            dummyHead = dummyHead.next;
        }
        while(l1 != null) {
            dummyHead.next = l1;
            l1 = l1.next;
            dummyHead = dummyHead.next;
        }
        while(l2 != null ) {
            dummyHead.next = l2;
            l2 = l2.next;
            dummyHead = dummyHead.next;
        }
        dummyHead = head;
        return head.next.next;
    }
    
    public ListNode mergeKLists(ListNode[] lists) {        
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        ListNode[] newLists = new ListNode[((lists.length + 1) / 2)];
        for(int i = 0; i < lists.length/2; ++i) {
            newLists[i] = mergeLists(lists[2*i], lists[2*i + 1]);
        }
        if(newLists[newLists.length - 1] == null) {
            newLists[newLists.length - 1] = lists[lists.length - 1];
        }
        return mergeKLists(newLists);
    }
}