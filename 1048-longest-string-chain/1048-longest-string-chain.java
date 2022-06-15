class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (String o1, String o2) -> o1.length() - o2.length());
        
        Map<String, Integer> map = new HashMap<>();
        int res = 1;
        
        for(String w: words) {
            // current Length
            int c = 1;
            
            StringBuilder sb = new StringBuilder(w);
            
            for(int i = 0; i < w.length(); ++i){
                sb.deleteCharAt(i);
                String s = sb.toString(); // previous word
                
                c = Math.max(c, map.getOrDefault(s, 0) + 1);
                
                sb.insert(i, w.charAt(i));
            }
            map.put(w, c);
            res = Math.max(res, c);
        }
        
        return res;
    }
}