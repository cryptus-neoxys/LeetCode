class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] arr = new int[26];
        int idx = 0;
        for(char cx: s.toCharArray()) {
            arr[cx - 'a'] = idx;
            idx++;
        }
        int c = 0, p = 0;
        List<Integer> res = new ArrayList<>();
        
        for(int i = 0; i < s.length(); ++i) {
            c = Math.max(c, arr[s.charAt(i) - 'a']);
            if(c == i) {
                res.add(i - p + 1);
                p = i + 1;
            }
        }
        
        return res;
    }
}