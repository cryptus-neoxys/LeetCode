/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node jag(Node h) {
        Node d = new Node(-1); d.next = h;
        
        Node p = h, f = h.next;
        
        while(p != null) {
            p.next = new Node(p.val);
            p.next.next = f;
            
            p = f;
            if(f != null) f = f.next;
        }
        
        return d.next;
    }
    
    public Node logic(Node h) {
        Node d = new Node(-1); d.next = h;
        
        Node c = h;
        
        while(c != null) {
            c.next.random = c.random != null ? c.random.next : null;
            
            c = c.next.next;
        }
        
        return d.next;
    }
    
    public Node deJag(Node h) {
        Node d = new Node(-1); d.next = h.next;
        
        Node p = h, c = h.next;
        
        while(p != null) {
            p.next = c.next;
            p = p.next;
            if(p != null) c.next = p.next;
            else c.next = null;
            c = c.next;
        }
        
        return d.next;
    }
    
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        // if(head.next == null) {
        //     Node x = new Node(head.val);
        //     x.next = null; x.random = new Node((head.random == null) 
        //                                        ? 0 :
        //                                        head.random.val);
        //     return x;
        // }
        Node jaged = jag(head);
        jaged = logic(jaged);
        
        // _DEBUG
        // while(jaged != null) {
        //     System.out.print("[v: " + jaged.val + ", r: " + 
        //                      (jaged.random != null ? jaged.random : -1)
        //                      + "] ");
        //     jaged = jaged.next;
        // }
        
        return deJag(jaged);
    }
}