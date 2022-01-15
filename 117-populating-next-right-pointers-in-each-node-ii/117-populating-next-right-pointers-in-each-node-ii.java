/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        Node next = null;
        while(q.size() != 0) {
            int i = q.size();
            next = null;
            while(i > 0) {
                Node top = q.poll();
                top.next = next;
                next = top;
                // System.out.print(top.val + " ");
                if(top.right != null) q.add(top.right);
                if(top.left != null) q.add(top.left);
                i--;
            }
            // System.out.println("");
        }
        
        return root;
    }
}