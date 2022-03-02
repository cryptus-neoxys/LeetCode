class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        int i = 0, c = 0;
        for(i = 0; i < s.length() && j < t.length() ; i++) {
            while(j < t.length() && t.charAt(j) != s.charAt(i)) j++;
            if(j < t.length() && t.charAt(j) == s.charAt(i)) c++;
            j++;
        }
        
        if(c == s.length()) return true;
        return false;
    }
}