class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res=new int[nums.length];
        int[] ans=new int[2];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            res[nums[i]]+=1;
        }
        for(int i=0;i<res.length;i++){
            if(res[i]==2){
                ans[idx]=i;
                idx++;
            }
        }
        return ans;
    }
}