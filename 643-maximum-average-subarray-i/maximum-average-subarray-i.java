class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double max=0;
       int left=0;
       int right=k-1;
       int sum=0;       
       for(int i=0;i<k;i++){
        sum+=nums[i];
        max=(double)sum/k;
       }
       for(int i=k;i<nums.length;i++){
          sum+=nums[i];
          sum-=nums[left];
          left++;
          max=Math.max((double)sum/k,max);
       }
       return max;
    }
}