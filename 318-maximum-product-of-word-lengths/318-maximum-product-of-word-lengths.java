class Solution {
    public int maxProduct(String[] words) {
        int[] wmask = new int[words.length];
        for(int i = 0; i < words.length; ++i) {
            for(char c: words[i].toCharArray()) {
                wmask[i] |= (1 << (c - 'a'));
            }
        }
        int res = 0;
        for(int i = 0; i < words.length; ++i) {
            for(int j = 0; j < words.length; ++j) {
                if (i != j && (wmask[i] & wmask[j]) == 0) 
					res = Math.max(res, words[i].length() * words[j].length());

            }
        }
        return res;
    }
}