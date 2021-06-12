class Solution {
    public int evalRPN(String[] tokens) {
		Stack<String> st = new Stack<>();
		String operations = "+-*/";

		Integer ans = null;

		for (String t : tokens) {
			if (operations.contains(t)) {
				int n2 = Integer.parseInt(st.pop());
				int n1 = Integer.parseInt(st.pop());
				switch (t) {
				case "+":
					ans = n1 + n2;
					break;
				case "-":
					ans = n1 - n2;
					break;
				case "*":
					ans = n1 * n2;
					break;
				case "/":
					ans = n1 / n2;
					break;
				default:
					break;
				}
				st.push(Integer.toString(ans));
			} else {
				st.push(t);
			}
		}

		return Integer.parseInt(st.pop());
    }
}