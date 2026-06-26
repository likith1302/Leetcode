class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        int n=prices.length;
        int[] res=Arrays.copyOf(prices,n);
        for(int i =0;i<prices.length;i++){
            while(!st.isEmpty() && prices[i]<=prices[st.peek()]){
                int ix=st.pop();
                res[ix]=prices[ix]-prices[i];
            }
            st.push(i);
        }
        return res;
    }
}