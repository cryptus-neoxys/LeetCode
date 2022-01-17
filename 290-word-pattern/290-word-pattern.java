class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String, String> kMap = new HashMap<>();
        Map<String, String> wMap = new HashMap<>();
        String[] words = s.split(" ");
        String[] keys = pattern.split("");
        
        int n = words.length;
        if(keys.length != n) return false;
        for(int i = 0; i < n; ++i) {
            // System.out.println(keys[i] + " " + words[i]);
            kMap.putIfAbsent(keys[i], words[i]);
            wMap.putIfAbsent(words[i], keys[i]);
            if(!kMap.get(keys[i]).equals(words[i])) return false;
            if(!wMap.get(words[i]).equals(keys[i])) return false;
        }
        
        return true;
    }
}