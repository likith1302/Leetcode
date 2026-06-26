class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] res=new int[2*nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            res[k]=nums[i];
            k++;
        }
        for(int i=nums.length-1;i>=0;i--){
            res[k]=nums[i];
            k++;
        }
        return res;
    }
}