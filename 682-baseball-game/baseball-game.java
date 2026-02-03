class Solution {
    public int calPoints(String[] operations) {
        int res=0;
        Stack<Integer> st=new Stack<>();
       for (String i : operations) {
    if (i.equals("+")) {
        int a = st.pop();
        int b = st.peek();
        st.push(a);
        st.push(a + b);
    } else if (i.equals("D")) {
        st.push(st.peek() * 2);
    } else if (i.equals("C")) {
        st.pop();
    } else {
        st.push(Integer.parseInt(i));
    }
}
     for(int i:st){
        res+=i;
     }
        return res;
    }
}