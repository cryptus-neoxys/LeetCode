class WordDictionary {
    class TrieNode {
        TrieNode[] links;
        boolean flag;
        
        TrieNode() {
            this.links = new TrieNode[26];
            this.flag = false;
        }
    }

    private TrieNode root;
    
    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode r = root;
        for(int i = 0; i < word.length(); ++i) {
            if(r.links[word.charAt(i) - 'a'] == null) {
                r.links[word.charAt(i) - 'a'] = new TrieNode();
            }
            r = r.links[word.charAt(i) - 'a'];
        }
        r.flag = true;
    }
    
    public boolean search(String word) {
        return match(word.toCharArray(), 0, root);
    }
    
    private boolean match(char[] chs, int k, TrieNode node) {
        if(k == chs.length) return node.flag;
        if(chs[k] != '.') {
            return node.links[chs[k] - 'a'] != null && match (chs, k + 1, node.links[chs[k] - 'a']);
        } else {
            for(int i = 0; i < node.links.length; ++i) {
                if(node.links[i] != null && match(chs, k+1, node.links[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */