/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    static class Pair {
        TreeNode node;
        Integer pos;
        
        Pair(TreeNode node, Integer pos) {
            this.node = node;
            this.pos = pos;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 1));
        int res = 1;
        while(!q.isEmpty()) {
            int s = q.size();
            ArrayList<Pair> t = new ArrayList<>();
            while(s-- > 0) {
                Pair p = q.poll();
                TreeNode node = p.node;
                Integer pos = p.pos;
                if(node.left != null) {
                    q.add(new Pair(node.left, 2*pos));
                    t.add(new Pair(node.left, 2*pos));
                }
                if(node.right != null) {
                    q.add(new Pair(node.right, 2*pos + 1));
                    t.add(new Pair(node.right, 2*pos + 1));
                }
            }
            if(t.size() > 0) {
                Pair left = t.get(0);
                Pair right = t.get(t.size() - 1);
                res = Math.max(res, right.pos - left.pos + 1);
                // System.out.println(res);
            }
        }
    return res;
    }
}
