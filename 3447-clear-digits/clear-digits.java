class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (!st.isEmpty() && Character.isLetter(st.peek())) {
                    st.pop();
                }
            } 
            else {
                st.push(ch);
            }
        }
        
        // stack to string
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}
