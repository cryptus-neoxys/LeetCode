class Solution {
    public int minimumLengthEncoding(String[] words) {
        TrieNode trie = new TrieNode();
        Map<TrieNode, Integer> nodes = new HashMap();
        
        for(int i = 0; i < words.length; ++i) {
            String word = words[i];
            TrieNode curr = trie;
            for(int j = word.length() - 1; j >= 0; --j) {
                curr = curr.get(word.charAt(j));
            }
            nodes.put(curr, i);
        }
        int res = 0;
        for(TrieNode node: nodes.keySet()) {
            if(node.count == 0) {
                res += words[nodes.get(node)].length() + 1;
            }
        }
        
        return res;
    }
}

class TrieNode {
    TrieNode[] children;
    int count;
    TrieNode() {
        children = new TrieNode[26];
        count = 0;
    }
    public TrieNode get(char c) {
        if(children[c - 'a'] == null) {
            children[c - 'a'] = new TrieNode();
            count++;
        }
        return children[c - 'a'];
    }
}