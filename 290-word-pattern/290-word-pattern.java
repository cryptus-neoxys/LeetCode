class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map hm = new HashMap();
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;
        
        
        for(Integer i = 0; i < words.length; ++i) {
            if(hm.put(pattern.charAt(i), i) != hm.put(words[i], i))
                return false;
            
            // _DEBUG
            // System.out.println(pattern.charAt(i) +  ": " + hm.put(pattern.charAt(i), i) + "\n"+ words[i] + ": " + hm.put(words[i], i));
        }
        
        return true;
    }
}