class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int left =0;
       for(int right=0;right<nums.length;right++){
        if(nums[right]!=1){
           left=right+1; 
        }
        else{
            count=Math.max(count,right-left+1);
        }
       }
        return count;
    }
}