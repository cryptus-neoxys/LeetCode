class Solution {
    public int fac(int n) {
        int r = 1;
        for(int i = 2; i <= n; ++i) {
            r *= i;
        }
        return r;
    }
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
		int f = fac(n);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		for(int i = 0; i < f; ++i) {
		    List<Integer> t = new ArrayList<Integer>();
            LinkedList<Integer> temp = new LinkedList<Integer>();
            for(int x: nums) temp.add(x);
		    int x = i;
		    for(int div = n; div >= 1; --div) {
		        int q = x / div;
		        int r = x % div;
		        t.add(temp.get(r));
		        temp.remove(r);
		        x = q;
		    }
            res.add(t);
		}
        return res;
    }
}