class Solution {
    
    private List<String> helper(String digits, ArrayList<String> ls, int idx, String[] kp) {
        if (idx == digits.length()) return ls;
        else {
            ArrayList<String> res = new ArrayList<String>();
            
            if(ls.size() == 0) {
                for(char x: kp[(digits.charAt(idx) - '0')].toCharArray()) {
                    res.add(("" + x));
                }
                return helper(digits, res, idx+1, kp);
            } else {
                for(String i: ls) {
                    for(char x: kp[(digits.charAt(idx) - '0')].toCharArray()) {
                        res.add(i + x);
                    }
                }
            }
            return helper(digits, res, idx + 1, kp);
        }
    }
    
    public List<String> letterCombinations(String digits) {
        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno","pqrs", "tuv", "wxyz"};
        return helper(digits, new ArrayList<String>(), 0, kp);
    }
}