class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] mainFreq = new int[26];
        
        for(String s: words2) {
            int[] internalFreq = new int[26];
            for(char c: s.toCharArray()) {
                internalFreq[c - 'a']++;
            }
            for(int i = 0; i < 26; ++i) {
                mainFreq[i] = Math.max(mainFreq[i], internalFreq[i]);
            }
        }
        System.out.println(Arrays.toString(mainFreq));
        List<String> res = new LinkedList<>();
        for(String w: words1) {
            int[] wordFreq = new int[26];
            for(char c: w.toCharArray()) {
                wordFreq[c - 'a']++;
            }
            System.out.println(w + "\n" + Arrays.toString(wordFreq));
            boolean flag = false;
            for(int i = 0; i < 26; i++) {
                if(mainFreq[i] != 0 && mainFreq[i] > wordFreq[i]) {
                    flag = true; break;
                }
            }
            if(!flag) {
                res.add(w);
            }
        }
        
        return res;
    }
}