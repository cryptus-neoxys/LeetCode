class Solution {
    public boolean isIsomorphic(String s, String t) {
		if(s.isEmpty() || t.isEmpty()) return true;
		if(s.length() != t.length()) return false;
		int len = s.length();
		String c = null, d = null; boolean flag = true;
		HashMap<String, String> hm1 = new HashMap<>();
		HashMap<String, String> hm2 = new HashMap<>();
		
		for(int i = 0; i < len; ++i) {
			c = hm1.get(s.substring(i, i+1));
			if(c == null) {
				hm1.put(s.substring(i, i+1), t.substring(i, i+1));
			} else if(!c.equals(t.substring(i, i+1))) {
				flag = false;
				break;
			}
            
            d = hm2.get(t.substring(i, i+1));
			if(d == null) {
				hm2.put(t.substring(i, i+1), s.substring(i, i+1));
			} else if(!d.equals(s.substring(i, i+1))) {
				flag = false;
				break;
			}
		}
		
		return flag;
        
    }
}