class Solution {
    public boolean detectCapitalUse(String word) {
        int c = 0, N = word.length();
        boolean startsWithCap = Character.isUpperCase(word.charAt(0));
        if(startsWithCap) c++;
        for(int i = 1; i < N; ++i) {
            if(Character.isUpperCase(word.charAt(i))) {
                c++;
                if(!startsWithCap) return false;
            }
        }
        System.out.println(c);
        return (c == 1 || c == N || c == 0);
    }
}