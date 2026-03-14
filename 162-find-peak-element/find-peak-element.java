class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
           int prev=nums[(i-1+n)%n];
           int next=nums[(i+1)%n];
           if(nums[i]>prev && nums[i]>next){
            return i;
           }
        }
        return 0;
    }
}