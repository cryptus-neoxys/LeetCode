class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int i = 0;
        while(i < s.length()) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
            i++;
        }
        i = 0;
        while(i < t.length()) {
            char x = t.charAt(i);
            if(hm.get(x) == null) return false;
            hm.put(x, hm.get(x) - 1);
            if(hm.get(x) == 0) hm.remove(x);
            i++;
        }
        
        return hm.size() == 0;
    }
}