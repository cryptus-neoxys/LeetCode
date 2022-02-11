class Solution {
    
    private boolean mapZero(HashMap<Character, Integer> map) {
        for(Map.Entry<Character, Integer> it: map.entrySet()) {
            if(it.getValue() != 0) return false;
        }
        
        return true;
    }
    
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        if(s1.length() > s2.length()) return false;
        
        for(char c : s1.toCharArray()) {
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        }
        for(int i = 0; i < s1.length(); ++i) {
            if(map.containsKey(s2.charAt(i))) {
                map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
            }
        }
        if(mapZero(map)) return true;
        int r = s1.length();
        
        for(; r < s2.length(); ++r) {
            if(map.containsKey(s2.charAt(r - s1.length()))) {
                map.put(s2.charAt(r - s1.length()), map.get(s2.charAt(r - s1.length())) + 1);
            }
            if(map.containsKey(s2.charAt(r))) {
                map.put(s2.charAt(r), map.get(s2.charAt(r)) - 1);
            }
            
            if(mapZero(map)) return true;
        }
        return false;
    }
}