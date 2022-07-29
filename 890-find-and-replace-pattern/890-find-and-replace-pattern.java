class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList();
        for (String word: words)
            if (helper(word, pattern))
                res.add(word);
        return res;
    }

    public boolean helper(String word, String pattern) {
        Map<Character, Character> hm1 = new HashMap();
        Map<Character, Character> hm2 = new HashMap();

        for (int i = 0; i < word.length(); ++i) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if (!hm1.containsKey(w)) hm1.put(w, p);
            if (!hm2.containsKey(p)) hm2.put(p, w);
            if (hm1.get(w) != p || hm2.get(p) != w)
                return false;
        }

        return true;
    }
}