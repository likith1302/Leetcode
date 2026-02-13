class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;// to find the dip in array
        }
        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i]){
                j--;//to find the elemnet to replace it 
            }
            swap(nums,i,j);//replace 
        }
        reverse(nums,i+1,nums.length-1);// to maintain the next permutation 
  
        }
       private void swap(int[] nums, int i, int j) {
        int temp = nums[i];//normal function
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {// normal function 
            swap(nums, start, end);
            start++;
            end--;
        }
        }        

    
}