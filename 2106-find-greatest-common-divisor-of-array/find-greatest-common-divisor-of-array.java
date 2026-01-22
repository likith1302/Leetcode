class Solution {
    public int GCD(int n1,int n2) {
         while(n1%n2!=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;
         }
         return n2;
    }
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
       
    for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
        }
        if(nums[i]<min){
            min=nums[i];
        }
    }
    return GCD(min,max);
}
}