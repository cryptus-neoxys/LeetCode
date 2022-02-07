class Solution {
    public char findTheDifference(String s, String t) {
        int res = 0;
        
        for(char c: s.toCharArray()) {
            res = res ^ (c - 'a');
        }
        for(char c: t.toCharArray()) {
            res = res ^ (c - 'a');
        }
        
        return (char) (res + 'a');
    }
}