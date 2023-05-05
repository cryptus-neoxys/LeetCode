class Solution {
    public int maxVowels(String s, int k) {
        List<Character> v = Arrays.asList(new Character[] {'a', 'e', 'i', 'o', 'u'});
        int res = 0;
        for(int i = 0; i < k; ++i) {
            if(v.contains(s.charAt(i))) res++;
        }
        int vowels = res;
        for(int i = k; i < s.length(); ++i) {
            if(v.contains(s.charAt(i-k))) vowels--;
            if(v.contains(s.charAt(i))) vowels++;
            res = Math.max(res, vowels);
            // System.out.println(s.charAt(i-k) + " " + res + " : " + s.charAt(i));
        }
        System.out.println();
        return res;
    }
}