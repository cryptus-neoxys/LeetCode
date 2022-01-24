class Solution {
    public String toLowerCase(String s) {
        int N = s.length();
        char[] chArr = s.toCharArray();
        
        for(int i = 0; i < N; ++i) {
            if(chArr[i] >= 65 && chArr[i] <= 90) chArr[i] += 32;
            // chArr[i] = Character.toLowerCase(chArr[i]);
        }
        
        return new String(chArr);
    }
}