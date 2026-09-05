class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
            int min=Integer.MAX_VALUE;
            for(int j=i;j<nums.length;j++){
                if(min>nums[j]) min=nums[j];
            }
            if((max-min)<= k) return i;
        }
        return -1;
    }
}