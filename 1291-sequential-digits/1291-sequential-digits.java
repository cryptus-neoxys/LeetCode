class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String inc = "123456789";
        
        List<Integer> arr = new ArrayList<>();
        
        int lowLen = ("" + low).length();
        int highLen = ("" + high).length();
        
        for(int i = lowLen; i < highLen + 1; ++i) {
            for(int j = 0; j < 10 - i; ++j) {
                Integer n = Integer.parseInt(inc.substring(j, j + i));
                System.out.println(n);
                if(n < low) continue;
                if(n > high) return arr;
                arr.add(n);
            }
        }
                        
        return arr;
    }
}