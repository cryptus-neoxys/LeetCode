class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        int i = 0, c = 0;
        while(i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) i++;
            j++;
        }        
        return i == s.length();
    }
}