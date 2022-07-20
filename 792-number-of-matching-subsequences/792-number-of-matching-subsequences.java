class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int n = s.length();
        Map<String, Integer> set = new HashMap<>();
        int res = 0;
        
        for(String w: words) {
            set.put(w, set.getOrDefault(w, 0) + 1);
        }
        
        for(String w: set.keySet()) {
            int i = 0, j = 0;
            
            while(i < n && j < w.length()) {
                if(s.charAt(i) == w.charAt(j)) {
                    j++;
                }
                i++;
            }
            if(j == w.length()) {
                res += set.get(w);
            }
        }
        
        return res;
    }
}