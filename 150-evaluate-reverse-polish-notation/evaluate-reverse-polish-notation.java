class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
       Set<String> symb = Set.of("+", "-", "*", "/");
        for (String token : tokens) {
            if (symb.contains(token)) {
                int b = st.pop(); 
                int a = st.pop(); 
                switch (token) {
                    case "+" -> st.push(a + b);
                    case "-" -> st.push(a - b);
                    case "*" -> st.push(a * b);
                    case "/" -> st.push(a / b);
                }

            }
            else{
                st.push(Integer.parseInt(token));
            }
        }
            return st.peek();
        }
}