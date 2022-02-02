class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int k = p.length(), n = s.length();
        char[] sA = s.toCharArray();
        char[] pA = p.toCharArray();
        List<Integer> res = new ArrayList<>();
        if(k > n) return res;
        
        int[] pM = new int[26];
        for(char c: pA) {
            pM[c - 'a']++;
        }
        
        boolean isMatch = false;
        for(int i = 0; i <= n - k; ++i) {
            int[] sM = new int[26];
            for(int j = 0; j < k; ++j) {
                char c = sA[i+j];
                sM[c - 'a']++;
            }
            isMatch = true;
            for(int j = 0; j < 26; ++j) {
                if(sM[j] != pM[j]) {
                    isMatch = false;
                    break;
                }
            }
            if(isMatch) res.add(i);
        }
        
        return res;
    }
}