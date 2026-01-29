class Solution {
    public String decodeString(String s) {

        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                numStack.push(num);
            }


            else if (ch != ']') {
                strStack.push(String.valueOf(ch));
            }

            else {
                StringBuilder temp = new StringBuilder();

                while (!strStack.peek().equals("[")) {
                    temp.insert(0, strStack.pop());
                }

                strStack.pop(); 

                int k = numStack.pop();

                String repeated = temp.toString().repeat(k);

                strStack.push(repeated);
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!strStack.isEmpty()) {
            ans.insert(0, strStack.pop());
        }

        return ans.toString();
    }
}
