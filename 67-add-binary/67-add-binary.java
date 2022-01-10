class Solution {
    public String addBinary(String a, String b) {
        int c = 0;
        int lengthA = a.length();
        int lengthB = b.length();
        if(lengthB > lengthA) return addBinary(b , a);
        int s = 0;
        StringBuilder sb = new StringBuilder();
        for(s = 0; s < lengthB; ++s) {
            int fromA = a.charAt(lengthA - s - 1) - '0';
            int fromB = b.charAt(lengthB - s - 1) - '0';
            int sum = (fromA + fromB + c);
            c = sum / 2;
            sb.append("" + sum % 2);
        }
        
        for(; s < lengthA; ++s) {
            int fromA = a.charAt(lengthA - s - 1) - '0';
            int sum = (fromA + c);
            c = sum / 2;
            sb.append("" + sum % 2);
        }
        
        if(c > 0) sb.append(c + "");
        
        StringBuilder rev = sb.reverse();
        String answer = rev.toString();
        return answer;
    }
}
// int a = Integer.parseInt(a, 2);
// int b = Integer.parseInt(b, 2);
// int res = a + b;