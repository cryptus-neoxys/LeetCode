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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> A = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) A.add(node.val);
        int[] res = new int[A.size()];
        for(int i = 0; i < A.size(); ++i) res[i] = A.get(i);
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i = A.size() - 1; i >= 0; --i) {
            int val = res[i];
            
            while(!stack.isEmpty() && stack.peek() <= res[i]) stack.pop();
            // System.out.println(i + " " + stack.peek());
            if(stack.isEmpty()) res[i] = 0;
            else res[i] = stack.peek();
            
            stack.push(val);
        }
        
        return res;
    }
}