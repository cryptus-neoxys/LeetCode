/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    
    private Map<Integer, Node> vis;
    
    private Node helper(Node node) {
        if(node == null) return null;
        if(vis.containsKey(node.val)) return vis.get(node.val);
        
        Node res = new Node(node.val, new ArrayList<Node>());
        vis.put(res.val, res);
        for(Node nbr: node.neighbors) {
            res.neighbors.add(helper(nbr));
        }
        
        return res;
    }
    
    public Node cloneGraph(Node node) {
        this.vis = new HashMap<Integer, Node>();
        return helper(node);
    }
}