class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        
        int k = p.length(), n = s.length();
        char[] sA = s.toCharArray();
        char[] pA = p.toCharArray();
        
        int[] charCount = new int[26];
        
        for(char c: p.toCharArray()) charCount[c - 'a']++;
        
        int left = 0, right = 0, counter = k;
        
        while(right < n) {
            if(charCount[s.charAt(right) - 'a'] >= 1) {
                counter--;
            }
            charCount[s.charAt(right) - 'a']--;
            right++;
            
            if(counter == 0) res.add(left);
            
            if(right - left == k) {
                if(charCount[s.charAt(left) - 'a'] >= 0) {
                    counter++;
                }
                charCount[s.charAt(left) - 'a']++;
                left++;
            }
        }
        
        return res;
    }
}