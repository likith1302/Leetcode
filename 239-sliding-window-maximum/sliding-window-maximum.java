class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n-k+1];
        int[] nge=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        nge[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && nums[i]>nums[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                nge[i]=n;
            }
            else{
                nge[i]=st.peek();
            }
        st.push(i);
        }
        int j=0;
        for(int i=0;i<=n-k;i++){
         if(j<i){
            j=i;
         }
         while(nge[j]<i+k){
            j=nge[j];
         }
         res[i]=nums[j];
        }
        return res;
            }
}