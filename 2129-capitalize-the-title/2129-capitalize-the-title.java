class Solution {
    public String capitalizeTitle(String title) {
        int N = title.length();
        char[] chArr = title.toCharArray();
        
        for(int i = 0; i < N; ++i) {
            
            int f = i;
            
            while(i < N && chArr[i] != ' ') {
                chArr[i] = Character.toLowerCase(chArr[i]);
                i++;
            }
            
            if(i - f > 2) chArr[f] = Character.toUpperCase(chArr[f]);
        }
        
        return new String(chArr);
    }
}