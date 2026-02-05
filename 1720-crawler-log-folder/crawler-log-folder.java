class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();
        for(String op:logs){
            if(op.equals("./")){
                continue;
            }
            else if(op.equals("../")){
                if(!st.isEmpty()){
                    st.pop();
                }
    
            }
            else{
                st.push(op);

            }      
              }
              return st.size();
    }
}