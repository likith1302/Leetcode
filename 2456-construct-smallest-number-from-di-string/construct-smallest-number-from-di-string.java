class Solution {
    public String smallestNumber(String pattern) {
    StringBuilder sb = new StringBuilder();
    Stack<Integer> st=new Stack<>();
    int n=1;
    for(int i=0;i<pattern.length();i++){
        if(pattern.charAt(i)=='D'){
            st.push(n);
            n++;
        }
        else if(pattern.charAt(i)=='I'){
            st.push(n);
            n++;
            while(!st.isEmpty()){
                sb.append(st.pop());
            }
        }
    }
    st.push(n);
    while(!st.isEmpty()){
                sb.append(st.pop());
            }
    return sb.toString();
    }
}